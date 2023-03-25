package com.institutscolaire.gestioninstitutscolaire.controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.institutscolaire.gestioninstitutscolaire.model.Reglement;
import com.institutscolaire.gestioninstitutscolaire.service.ReglementService;

@CrossOrigin("*")
@RequestMapping("/api")
@RestController
public class ReglementController {

	@Autowired
	private ReglementService reglementService;
	
	@GetMapping("/reglements/{annee}/{m}")
	public double getMont1(@PathVariable int annee, @PathVariable int m) {
		System.out.println("Get Numbers");
		int x = reglementService.nbMois(annee,m);
		System.out.println(x);
		if(x == 0) {
			return 0;
		}else {
			double y = reglementService.getMontMois(annee, m);
			System.out.println(y);
			return y;
		}
	}
	
	@GetMapping("/reglements/{d1}/{d2}")
	public List<Reglement> listReglement(@PathVariable String d1, @PathVariable String d2) throws ParseException{
		System.out.println(d1);
		System.out.println(d2);
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
		Date d3 = formatter.parse(d1);
		Date d4 = formatter.parse(d2);
		return reglementService.listReglement(d3,d4);
	}
	
	@GetMapping("/reglements/M/{annee}")
	public double getMontA(@PathVariable int annee) {
		System.out.println("Get Numbers...");
		int x = reglementService.nbAnnee(annee);
		System.out.println(x);
		if(x == 0) {
			return 0;
		}else {
			return reglementService.max();
		}
	}
}
