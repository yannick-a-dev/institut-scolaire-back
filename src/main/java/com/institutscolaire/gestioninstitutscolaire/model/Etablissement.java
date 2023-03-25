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
@Table(name = "etablissement",uniqueConstraints = {
		@UniqueConstraint(columnNames = "code" + ""),
		@UniqueConstraint(columnNames = "libelle")
})
public class Etablissement {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String code;
	private String libelle;
	private String adresse;
	private String ville;
	private String tel;
}
