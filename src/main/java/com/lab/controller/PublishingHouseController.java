package com.lab.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lab.data.PublishingHouse;
import com.lab.service.PublishingHouseService;

@RestController
public class PublishingHouseController {
	
	@Autowired
	private PublishingHouseService publishingHouseService;
	
	@GetMapping("/pub-houses")
	public List<PublishingHouse> getAll() {
		return publishingHouseService.findAll();
	}
	
	@PostMapping("/pub-houses")
	public PublishingHouse update(@RequestBody PublishingHouse publishingHouse) {
		return publishingHouseService.save(publishingHouse);
	}
	
	@PutMapping("/pub-houses")
	public PublishingHouse add(@RequestBody PublishingHouse publishingHouse) {
		return publishingHouseService.save(publishingHouse);
	}
	
	@DeleteMapping("/pub-houses/{id}")
	public void remove(@RequestParam int id) {
		publishingHouseService.delete(id);
	}

}
