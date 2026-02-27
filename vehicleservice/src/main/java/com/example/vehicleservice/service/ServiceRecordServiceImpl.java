package com.example.vehicleservice.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.vehicleservice.entity.ServiceDetails;
import com.example.vehicleservice.entity.ServiceRecord;
import com.example.vehicleservice.repository.ServiceRepository;

@Service
public class ServiceRecordServiceImpl implements ServiceRecordService {
	
	@Autowired
	private ServiceRepository serviceRepository;
	
	@Override
	public ServiceRecord createService(ServiceRecord serviceRecord) {
		
		double total=0;
		
		for(ServiceDetails detail:serviceRecord.getServiceDetails()) {
			total +=detail.getItemPrice()*detail.getQuantity();
			detail.setServiceRecord(serviceRecord);
			
		}
		serviceRecord.setTotalCost(total);
		return serviceRepository.save(serviceRecord);
	}
	
	@Override
	public List<ServiceRecord>getServiceHistory(Long vehicleid){
		return serviceRepository.findByVehicleVehicleId(vehicleid);
	}

}
