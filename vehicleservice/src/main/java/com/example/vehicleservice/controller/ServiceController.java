package com.example.vehicleservice.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.vehicleservice.entity.ServiceRecord;
import com.example.vehicleservice.service.ServiceRecordService;

@RestController
@RequestMapping("/api/services")
@CrossOrigin("*")
public class ServiceController {

    @Autowired
    private ServiceRecordService serviceRecordService;

    // Create Service & Bill
    @PostMapping
    public ServiceRecord createService(@RequestBody ServiceRecord serviceRecord) {
        return serviceRecordService.createService(serviceRecord);
    }

    // Get Service History
    @GetMapping("/vehicle/{vehicleId}")
    public List<ServiceRecord> getServiceHistory(@PathVariable Long vehicleId) {
        return serviceRecordService.getServiceHistory(vehicleId);
    }
}