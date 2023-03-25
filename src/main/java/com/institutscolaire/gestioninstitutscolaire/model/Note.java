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
@Table(name = "note",uniqueConstraints = {
		@UniqueConstraint(columnNames = "numero")
})
public class Note {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private int numero;
	private int annee;
	@JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd", timezone = "GMT")
	private Date dateMvt;
	private int semestre;
	private String codeMatiere;
	private String matiere;
	private String codeClasse;
	private String classe;
	private String codeEnseignant;
	private String enseignant;
	private double coef;
	@JsonManagedReference
	@JsonIgnore
	@OneToMany(mappedBy = "note", fetch = FetchType.EAGER)
	private List<Lnote> lnotes = new ArrayList<>();
}
