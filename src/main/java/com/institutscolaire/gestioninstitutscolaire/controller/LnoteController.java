package com.institutscolaire.gestioninstitutscolaire.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.institutscolaire.gestioninstitutscolaire.model.Lnote;
import com.institutscolaire.gestioninstitutscolaire.service.LnoteService;

@CrossOrigin("*")
@RequestMapping("/api")
@RestController
public class LnoteController {

	@Autowired
	private LnoteService lnoteService;
	
	@GetMapping("/lnotes")
	public List<Lnote> list(){
		System.out.println("Get all Lnotes...");
		return lnoteService.getAll();
	}
	
	@GetMapping("/lnotes/{numero}")
	public List<Lnote> listreg(@PathVariable int numero){
		System.out.println(numero);
		return lnoteService.findByNumero(numero);
	}
}
