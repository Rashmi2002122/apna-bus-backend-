package com.ranjan.test.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ranjan.test.DAO.BusRepository;
import com.ranjan.test.entity.Bus;

@Component
public class BusServices {

	@Autowired
	private BusRepository busRepository;

	public List<Bus> getAllBusDetails() {
		List<Bus> bus = (List<Bus>) this.busRepository.findAll();
		return bus;
	}

	public Bus setBook(Bus b) {
		Bus savedBus = this.busRepository.save(b);
		return savedBus;
	}

	public Bus getBus(int bus_no) {
		Bus busDetails = this.busRepository.findById(bus_no);
		return busDetails;
	}

	public void updateBus(Bus bus, Long bus_no) {
		bus.setBus_no(bus_no);
		busRepository.save(bus);

	}
	public void deleteBus(int id) {
		busRepository.deleteByBusNo(id);

	}

}
