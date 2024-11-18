package com.ranjan.test.DAO;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.ranjan.test.entity.Bus;

import jakarta.transaction.Transactional;

public interface BusRepository extends CrudRepository<Bus, Integer> {

	public Bus findById(int busNo);
	
	@Modifying
	@Transactional
	@Query("DELETE FROM Bus b WHERE b.bus_no = :bus_no")
	void deleteByBusNo(@Param("bus_no") int busNo);
	
}
