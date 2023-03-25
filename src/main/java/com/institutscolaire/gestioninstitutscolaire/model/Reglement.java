package com.institutscolaire.gestioninstitutscolaire.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
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
@Table(name = "reglement",uniqueConstraints = {
		@UniqueConstraint(columnNames = "numero")
})
public class Reglement {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int annee;
	private int numero;
	@JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT")
	private Date dateReglement;
	private String matricule;
	private String nom;
	private String prenom;
	private double montant;
	private double espece;
	private double cheque;
	private String  classe;
	private int numInscription;
	private String modeReglement;
	@JsonManagedReference
	@JsonIgnore
	@OneToMany(mappedBy = "reglement",fetch = FetchType.EAGER)
	private List<Lreglement> lreglements = new ArrayList<>();
}
