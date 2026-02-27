package com.example.vehicleservice.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vehicleservice.entity.ServiceItem;
import com.example.vehicleservice.repository.ServiceItemRepository;

@Service
public class ServiceItemServiceImpl implements ServiceItemService {

    @Autowired
    private ServiceItemRepository serviceItemRepository;

    @Override
    public ServiceItem addServiceItem(ServiceItem item) {
        return serviceItemRepository.save(item);
    }

    @Override
    public List<ServiceItem> getItemsByCenter(Long centerId) {
        return serviceItemRepository.findByServiceCenterCenterId(centerId);
    }
}