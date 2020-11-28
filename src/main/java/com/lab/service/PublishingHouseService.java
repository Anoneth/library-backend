package com.lab.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lab.data.PublishingHouse;
import com.lab.repository.PublishingHouseRepository;

@Service
public class PublishingHouseService {
	
	@Autowired
	private PublishingHouseRepository publishingHouseRepository;
	
	public PublishingHouseService(PublishingHouseRepository publishingHouseRepository) {
		this.publishingHouseRepository = publishingHouseRepository;
	}
	
	public List<PublishingHouse> findAll() {
		return publishingHouseRepository.findAll();
	}
	
	public PublishingHouse save(PublishingHouse publishingHouse) {
		return publishingHouseRepository.save(publishingHouse);
	}
	
	public void delete(int id) {
		publishingHouseRepository.deleteById(id);
	}
}
