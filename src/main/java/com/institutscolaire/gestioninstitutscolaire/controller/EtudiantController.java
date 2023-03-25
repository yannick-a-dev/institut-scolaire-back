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
import com.institutscolaire.gestioninstitutscolaire.model.Etudiant;
import com.institutscolaire.gestioninstitutscolaire.model.ListEtudiant;
import com.institutscolaire.gestioninstitutscolaire.service.EtudiantService;

import jakarta.servlet.ServletContext;

@CrossOrigin("*")
@RequestMapping("/api")
@RestController
public class EtudiantController {

	@Autowired
	private EtudiantService etudiantService;

	@Autowired
	ServletContext servletContext;

	@GetMapping("/etudiants/7")
	public int getCode() {
		System.out.println("Get Numbers...");
		int x = etudiantService.nbre();
		System.out.println(x);
		if (x == 0) {
			return 0;
		} else {
			return etudiantService.max();
		}
	}

	@GetMapping("/etudiants")
	public List<Etudiant> list() {
		System.out.println("Get all etudiants...");
		return etudiantService.getAll();
	}
	
	@GetMapping("/etudiants/list/{code}")
	public ResponseEntity<ListEtudiant> listEtudiants(@PathVariable String code){
		Optional<ListEtudiant> cat = etudiantService.findById(code);
		return cat.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}
}
