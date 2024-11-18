package com.ranjan.test.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ranjan.test.entity.Bus;
import com.ranjan.test.services.BusServices;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class BusController {

	@Autowired
	private BusServices busServices;

	@GetMapping("/bus")
	public ResponseEntity<List<Bus>> getBooks() {

		List<Bus> list = this.busServices.getAllBusDetails();
		if (list.size() <= 0) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		for (Bus bus : list) {
			System.out.println(bus);
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(list);
	}

	@PostMapping("/setbus")
	public ResponseEntity<Bus> addBook(@RequestBody Bus bus) {
		Bus busData = this.busServices.setBook(bus);
		return ResponseEntity.ok(busData);
	}

	@GetMapping("/bus/{bus_no}")
	public ResponseEntity<Bus> getBook(@PathVariable("bus_no") int bus_no) {
		Bus bus = busServices.getBus(bus_no);
		if (bus == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.of(Optional.of(bus));
	}

	@PostMapping
	public ResponseEntity<Bus> updateData(@PathVariable("bus_no") int bus_no) {
		Bus bus = busServices.getBus(bus_no);
		if (bus == null) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
		return ResponseEntity.status(HttpStatus.CREATED).body(bus);
	}
	
	@DeleteMapping("/deletebus/{bus_no}")
	public void deleteBookHandler(@PathVariable("bus_no") int bus_no) {
		this.busServices.deleteBus(bus_no);
	}
}
