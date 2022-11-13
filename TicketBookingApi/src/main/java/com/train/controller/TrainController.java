package com.train.controller;

import java.util.Date;
import java.util.UUID;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.train.passenger.Passenger;
import com.train.traindata.Train1;

import lombok.extern.slf4j.Slf4j;

@RestController
public class TrainController {

	@PostMapping(value = "/Ticket", consumes = { "application/json" }, produces = { "application/json" })
	ResponseEntity<Train1> bookTicket(@RequestBody Passenger request)

	{

		String pnrNumber = UUID.randomUUID().toString();
		Train1 t1 = new Train1();
		t1.setPnrNumber(pnrNumber);
		t1.setTrainName("Shanghai Maglev");
		t1.setFrom("Peddapalli");
		t1.setTo("Hyderabad");
		t1.setTravelDate(250922);
		return new ResponseEntity<>(t1, HttpStatus.CREATED);
	}
	@GetMapping("/BookTickets")
 ResponseEntity<String> getRequest(){
	 String msg="Welcome to Railway Tickets Booking app";
	 return new ResponseEntity<>(msg,HttpStatus.OK);
 }
}
