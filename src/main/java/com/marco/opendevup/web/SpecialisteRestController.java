package com.marco.opendevup.web;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.marco.opendevup.dao.SpecialisteRepository;
import com.marco.opendevup.entities.Specialiste;

@RestController
public class SpecialisteRestController {

	@Autowired
	private SpecialisteRepository specialisteRepository;
	
	@GetMapping("/specialistes")
	public List<Specialiste> listSpecialistes(){
		return specialisteRepository.findAll();
	}
	@PostMapping("/specialistes")
	public Specialiste saveSpecialiste(@RequestBody Specialiste s) {
		return specialisteRepository.save(s);
	}
	
}
