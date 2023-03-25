package com.institutscolaire.gestioninstitutscolaire.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.institutscolaire.gestioninstitutscolaire.model.Banque;
import com.institutscolaire.gestioninstitutscolaire.service.BanqueService;

@RestController
@RequestMapping("/api")
@CrossOrigin("*")
public class BanqueController {

	@Autowired
	private BanqueService banqueService;
	
	@GetMapping("/banques")
	public List<Banque> list(){
		System.out.println("Get all Banque...");
		return banqueService.getAll();
	}
	
	@GetMapping("/banques/{id}")
	public ResponseEntity<Banque> post(@PathVariable Long id){
		Optional<Banque> cat = banqueService.findById(id);
		return cat.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
	}
	
	@PostMapping("/banques")
	public Long save(@RequestBody Banque categorie) {
		return banqueService.save(categorie);
	}
	
	@PutMapping("/banques/{code}")
	public void update(@PathVariable String code, @RequestBody Banque categorie) {
		banqueService.update(code,categorie);
	}
	
	@DeleteMapping("/banques/{id}")
	public void delete(@PathVariable Long id) {
		banqueService.delete(id);
	}
}
