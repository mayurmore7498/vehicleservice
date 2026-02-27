package com.example.vehicleservice.service;

import java.util.List;
import com.example.vehicleservice.entity.ServiceItem;

public interface ServiceItemService {

    ServiceItem addServiceItem(ServiceItem item);
    List<ServiceItem> getItemsByCenter(Long centerId);
}