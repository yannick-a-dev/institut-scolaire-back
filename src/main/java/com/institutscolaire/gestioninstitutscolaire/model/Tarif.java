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
@Table(name = "tarif",uniqueConstraints = {
		@UniqueConstraint(columnNames = "code")
})
public class Tarif {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String code;
	private String codeSpecialite;
	private String codeDomaine;
	private int annee;
	private double frais;
	@JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd",timezone = "GMT")
	private Date d1;
	private double m1;
	@JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd",timezone = "GMT")
	private Date d2;
	private double m2;
	@JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd",timezone = "GMT")
	private Date d3;
	private double m3;
	@JsonFormat(shape = Shape.STRING, pattern = "yyyy-MM-dd",timezone = "GMT")
	private Date d4;
	private double montant;
	private int remise;
	
}
