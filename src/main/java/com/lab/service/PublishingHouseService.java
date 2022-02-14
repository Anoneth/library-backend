package com.lab.service;

import java.math.BigInteger;
import java.sql.Date;
import java.util.ArrayList;
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
		List<PublishingHouse> result = new ArrayList<PublishingHouse>();
		List<Object[]> phs = publishingHouseRepository.getAll();
		for (int i = 0; i < phs.size(); i++) {
			result.add(new PublishingHouse());
			result.get(i).setPhID((int)phs.get(i)[0]);
			result.get(i).setPhName((String)phs.get(i)[1]);
			result.get(i).setPhAddress((String)phs.get(i)[2]);
			result.get(i).setCount(((BigInteger)phs.get(i)[3]).intValue());
		}
		return result;
	}
	
	public PublishingHouse save(PublishingHouse publishingHouse) {
		return publishingHouseRepository.save(publishingHouse);
	}
	
	public void delete(int id) {
		publishingHouseRepository.deleteById(id);
	}
}
