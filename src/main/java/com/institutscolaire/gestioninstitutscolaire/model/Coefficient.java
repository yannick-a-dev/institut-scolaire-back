package com.institutscolaire.gestioninstitutscolaire.model;

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
@Table(name = "coefficient",uniqueConstraints = {
		@UniqueConstraint(columnNames = "code")
})
public class Coefficient {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String code;
	private int annee;
	private int semestre;
	private String codeClasse;
	private String classe;
	private String codeMatiere;
	private String matiere;
	private double coef;
}
