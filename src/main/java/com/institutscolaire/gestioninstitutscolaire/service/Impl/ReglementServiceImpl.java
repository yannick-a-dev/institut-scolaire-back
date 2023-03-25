package com.institutscolaire.gestioninstitutscolaire.service.Impl;

import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import com.institutscolaire.gestioninstitutscolaire.model.Reglement;
import com.institutscolaire.gestioninstitutscolaire.service.ReglementService;

@Service
public class ReglementServiceImpl implements ReglementService {

	@Override
	public List<Reglement> listReglement(Date d3, Date d4) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int nbAnnee(int annee) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double max() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double getMontMois(int annee, int m) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int nbMois(int annee, int m) {
		// TODO Auto-generated method stub
		return 0;
	}

}
