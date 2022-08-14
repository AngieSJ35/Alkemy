package com.alkemy.icons.icons.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

import com.alkemy.icons.icons.entity.PersonajeEntity;

@Repository
public interface PersonajeRepository extends JpaRepository<PersonajeEntity, Long> {

	Optional<PersonajeEntity> findByNombre(String nombre);

	
}
