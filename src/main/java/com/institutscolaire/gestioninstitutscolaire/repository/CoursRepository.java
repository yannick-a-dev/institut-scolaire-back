package com.institutscolaire.gestioninstitutscolaire.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.institutscolaire.gestioninstitutscolaire.model.Cours;

public interface CoursRepository extends JpaRepository<Cours, Long> {

}
