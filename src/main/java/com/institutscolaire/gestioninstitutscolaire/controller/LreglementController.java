package com.institutscolaire.gestioninstitutscolaire.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.institutscolaire.gestioninstitutscolaire.model.Lreglement;
import com.institutscolaire.gestioninstitutscolaire.service.LreglementService;

@CrossOrigin("*")
@RequestMapping("/api")
@RestController
public class LreglementController {

	@Autowired
	private LreglementService lreglementService;
	
	@GetMapping("/lreglements")
	public List<Lreglement> list(){
		System.out.println("Get all Lreglements...");
		return lreglementService.getAll();
	}
	
	@GetMapping("/lreglements/{numero}")
	public List<Lreglement> listlreg(@PathVariable int numero){
		System.out.println(numero);
		return lreglementService.findByNumero(numero);
	}
}
