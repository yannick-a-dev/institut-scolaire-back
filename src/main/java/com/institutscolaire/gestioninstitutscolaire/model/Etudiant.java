package com.institutscolaire.gestioninstitutscolaire.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

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
@Table(name = "etudiant",uniqueConstraints = {
		@UniqueConstraint(columnNames = "matricule"
				+ ""),
		@UniqueConstraint(columnNames = "email")
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class Etudiant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nom;
	private String prenom;
	private String adresse;
	private String ville;
	private String matricule;
	private String codePostal;
	@JsonFormat(shape = Shape.STRING, pattern = "yyy-MM-dd", timezone = "GMT")
	private Date dateNaissance;
	private String lieu;
	private String pere;
	private String profPere;
	private String mere;
	private String profMere;
	private String tuteur;
	private String profTuteur;
	private String quartier;
	private String carre;
	private String Concession;
	private String codeClasse;
	private String codeEtablissement;
	private String etablissement;
	private String classe;
	private int annee;
	private String cinTuteur;
	private String genre;
	private String codeNationalite;
	private String tel;
	private String telTuteur;
	private String email;
	private String codeNiveau;
	private String Bp;
	private String fileName;
	
	
}
