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
@Table(name = "enseignant",uniqueConstraints = {
		@UniqueConstraint(columnNames = "code"
				+ ""),
		@UniqueConstraint(columnNames = "email")
})
public class Enseignant {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String code;
	private String prenom;
	private String adresse;
	private String ville;
	private String codePostal;
	@JsonFormat(shape = Shape.STRING, pattern = "yyy-MM-dd", timezone = "GMT")
	private Date dateNaissance;
	private String lieu;
	private String codeSpecialite;
	private String specialite;
	private int annee;
	private String cin;
	private String genre;
	private String codeNationalite;
	private String tel;
	private String email;
	private String codeNiveau;
	private String niveau;
	private String fileName;
}
