package com.institutscolaire.gestioninstitutscolaire.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.institutscolaire.gestioninstitutscolaire.model.StatData;
import com.institutscolaire.gestioninstitutscolaire.service.StatReglementService;

@CrossOrigin("*")
@RequestMapping("/api")
@RestController
public class StatReglementController {

	@Autowired
	private StatReglementService statReglementService;
	
	@GetMapping("/stats")
	public List<StatData> list(){
		System.out.println("Get all Statistiques...");
		return statReglementService.getAll();
	}
}
