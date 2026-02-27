package com.example.vehicleservice.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.vehicleservice.entity.ServiceItem;
import com.example.vehicleservice.service.ServiceItemService;

@RestController
@RequestMapping("/api/service-items")
@CrossOrigin("*")
public class ServiceItemController {

    @Autowired
    private ServiceItemService serviceItemService;

    @PostMapping
    public ServiceItem addItem(@RequestBody ServiceItem item) {
        return serviceItemService.addServiceItem(item);
    }

    @GetMapping("/center/{centerId}")
    public List<ServiceItem> getItemsByCenter(@PathVariable Long centerId) {
        return serviceItemService.getItemsByCenter(centerId);
    }
}