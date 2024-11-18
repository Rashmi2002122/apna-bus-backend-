package com.ranjan.test.entity;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "bus_name")
public class Bus {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	
	@JsonProperty("bus_no")
	private Long bus_no;
	
	@JsonProperty("bus_colour")
	private String bus_colour;
	
	@JsonProperty("busname")
	private String busname;
	
	@JsonProperty("start_from")
	private String start_from;
	
	@JsonProperty("end_to")
	private String end_to;
	
	@JsonProperty("ticket_price")
	private Double ticket_price;


	public Bus() {
	}

	
	public Bus(Long bus_no, String bus_colour, String busname, String start_from, String end_to, Double ticket_price) {
		this.bus_no = bus_no;
		this.bus_colour = bus_colour;
		this.busname = busname;
		this.start_from = start_from;
		this.end_to = end_to;
		this.ticket_price = ticket_price;
	}

	public Long getBus_no() {
		return bus_no;
	}

	public void setBus_no(Long bus_no) {
		this.bus_no = bus_no;
	}

	public String getBus_colour() {
		return bus_colour;
	}

	public void setBus_colour(String bus_colour) {
		this.bus_colour = bus_colour;
	}

	public String getBusname() {
		return busname;
	}

	public void setBusname(String busname) {
		this.busname = busname;
	}

	public String getStart_from() {
		return start_from;
	}

	public void setStart_from(String start_from) {
		this.start_from = start_from;
	}

	public String getEnd_to() {
		return end_to;
	}

	public void setEnd_to(String end_to) {
		this.end_to = end_to;
	}

	public Double getTicket_price() {
		return ticket_price;
	}

	public void setTicket_price(Double ticket_price) {
		this.ticket_price = ticket_price;
	}

}
