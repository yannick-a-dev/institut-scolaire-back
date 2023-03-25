package com.institutscolaire.gestioninstitutscolaire.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.institutscolaire.gestioninstitutscolaire.model.Cycle;
import com.institutscolaire.gestioninstitutscolaire.service.CycleService;

@CrossOrigin("*")
@RequestMapping("/api")
@RestController
public class CycleController {

	@Autowired
	private CycleService cycleService;
	
	@GetMapping("/cycles/7")
	public int getCode() {
		System.out.println("Get Numbers...");
	   int x = cycleService.nbre();
	   System.out.println(x);
	   if(x == 0) {
		   return 0;
	   }else {
		   return cycleService.max();
	   }
	}
	
	@GetMapping("/cycles")
	public List<Cycle> list(){
		System.out.println("Get all Cycles...");
		return cycleService.getAll();
	}
	
	@GetMapping("/cycles/{id}")
	public ResponseEntity<Cycle> get(@PathVariable String id){
	   Optional<Cycle> cat = cycleService.findByCode(id);
	return cat.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}
}
