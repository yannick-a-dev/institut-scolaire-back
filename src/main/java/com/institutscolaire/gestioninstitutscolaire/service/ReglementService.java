package com.institutscolaire.gestioninstitutscolaire.service;

import java.util.Date;
import java.util.List;

import com.institutscolaire.gestioninstitutscolaire.model.Reglement;

public interface ReglementService {

	List<Reglement> listReglement(Date d3, Date d4);

	int nbAnnee(int annee);

	double max();

	double getMontMois(int annee, int m);

	int nbMois(int annee, int m);

}
