package com.institutscolaire.gestioninstitutscolaire.model;

import java.util.Date;

import org.hibernate.annotations.BatchSize;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
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
@Table(name = "utilisateur",uniqueConstraints = {
		@UniqueConstraint(columnNames = "username"
				+ ""),
		@UniqueConstraint(columnNames = "email")
})
@JsonIgnoreProperties(ignoreUnknown = true)
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	//@NotBlank
	//@Size(max= 40)
	private String username;
	//@NotBlank
	//@Size(max= 60)
	//@Email
	private String email;
	private String nom;
	private int code;
	private String password;
	private boolean isActive;
	private String role;
	private String fileName;
}
