package org.cap.controller;

import java.util.List;


import org.cap.model.Pilot;
import org.cap.service.IPilotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class PilotController {

	@Autowired
	private IPilotService pilotService;
	
	@GetMapping("/pilots")
	public ResponseEntity<List<Pilot>> getAllPilots(){
		
		List<Pilot> pilots=pilotService.getAllPilots();
		
		if(pilots.isEmpty())
			return new ResponseEntity("Sorry! Pilots Not available!",
					HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<List<Pilot>>(pilots,HttpStatus.OK);
	}
	
	@DeleteMapping(value="/pilots/{pilotId}")
	public ResponseEntity<List<Pilot>>deletCustomer(
			@PathVariable("pilotId")Integer pilotId){
		List<Pilot> pilots= pilotService.deletePilot(pilotId);
		
		if(pilots==null)
			return new ResponseEntity
					("Sorry! Customer Id not available!", HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<List<Pilot>>(pilots, HttpStatus.OK);
	}

	
	@GetMapping(value="/pilots/{pilotId}")
	public ResponseEntity<Pilot> findCustomers(
			@PathVariable("pilotId")Integer pilotId){
		Pilot pilot= pilotService.findPilot(pilotId);
		
		if(pilot==null)
			return new ResponseEntity
					("Sorry! Customer ID does not exists!", HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<Pilot>(pilot, HttpStatus.OK);
	}

	@PostMapping(value="/pilots",produces="application/json")
	public ResponseEntity<List<Pilot>> createCustomer(
			@RequestBody Pilot pilot){
		
		List<Pilot> pilots=pilotService.createPilot(pilot);
		
		if(pilots.isEmpty())
			return new ResponseEntity("Sorry! Insertion failed", HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<List<Pilot>>(pilots, HttpStatus.OK);	
		
	}
	
	
	@PutMapping("/pilots")
	public ResponseEntity<List<Pilot>> updateCustomer(
			@RequestBody Pilot pilot){
		
		List<Pilot> pilots=pilotService.updatePilot(pilot);
		
		if(pilots.isEmpty())
			return new ResponseEntity("Sorry! Insertion failed", HttpStatus.NOT_FOUND);
		
		return new ResponseEntity<List<Pilot>>(pilots, HttpStatus.OK);	
		
	}
	
}
