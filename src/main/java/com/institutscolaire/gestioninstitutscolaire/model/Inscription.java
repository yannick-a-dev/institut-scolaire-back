package com.institutscolaire.gestioninstitutscolaire.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.UniqueConstraint;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Entity
@Table(name = "inscription",uniqueConstraints = {
		@UniqueConstraint(columnNames = "numero")
})
public class Inscription {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int annee;
	private int numero;
	@JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT")
	private Date dateInscription;
	private String matricule;
	private String nom;
	private String prenom;
	private String codeClasse;
	private String classe;
	private double montant;
	@JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT")
	private Date dateVersement;
}
