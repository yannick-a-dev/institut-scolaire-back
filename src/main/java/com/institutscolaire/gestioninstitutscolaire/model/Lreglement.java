package com.institutscolaire.gestioninstitutscolaire.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "lreglement")
public class Lreglement {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int annee;
	private int numero;
	@JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT")
	private Date echeance;
	private String modeReglement;
	private double montant;
	private String numpiece;
	private String banque;
	@ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	@JsonBackReference
	private Reglement reglement;
}
