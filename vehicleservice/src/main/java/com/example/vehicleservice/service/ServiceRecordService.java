package com.example.vehicleservice.service;

import java.util.List;

import com.example.vehicleservice.entity.ServiceRecord;

public interface ServiceRecordService {
	
	ServiceRecord createService(ServiceRecord serviceRecord);
	List<ServiceRecord>getServiceHistory(Long vehicleId);

}
