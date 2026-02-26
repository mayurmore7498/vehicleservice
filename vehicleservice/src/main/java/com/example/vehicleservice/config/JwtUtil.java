package com.example.vehicleservice.config;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.security.Keys;
import org.springframework.stereotype.Component;

import java.security.Key;
import java.util.Date;

@Component
public class JwtUtil {

    // MUST be at least 32 characters for HS256
    private static final String SECRET_KEY =
            "vehicle_service_secret_vehicle_service_secret";

    private static final long EXPIRATION_TIME =
            1000 * 60 * 60 * 10; // 10 hours

    private Key getSigningKey() {
        return Keys.hmacShaKeyFor(SECRET_KEY.getBytes());
    }

    public String generateToken(String email) {
        return Jwts.builder()
                .setSubject(email)
                .setIssuedAt(new Date())
                .setExpiration(new Date(System.currentTimeMillis() + EXPIRATION_TIME))
                .signWith(getSigningKey())   // ✅ CORRECT
                .compact();
    }

    public String extractEmail(String token) {
        Claims claims = Jwts.parserBuilder()
                .setSigningKey(getSigningKey())   // ✅ CORRECT
                .build()
                .parseClaimsJws(token)
                .getBody();

        return claims.getSubject();
    }
}