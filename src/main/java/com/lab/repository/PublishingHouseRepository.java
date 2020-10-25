package com.lab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lab.data.PublishingHouse;

@Repository
public interface PublishingHouseRepository extends JpaRepository<PublishingHouse, Integer> {

}
