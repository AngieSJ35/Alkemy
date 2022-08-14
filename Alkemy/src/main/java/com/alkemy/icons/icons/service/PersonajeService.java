package com.alkemy.icons.icons.service;

import java.util.List;
import java.util.Optional;

import com.alkemy.icons.icons.dto.PersonajeDTO;
import com.alkemy.icons.icons.entity.PersonajeEntity;

public interface PersonajeService {

	PersonajeDTO save(PersonajeDTO dto);

	List<PersonajeDTO> getAllPersonajes();

	Optional<PersonajeEntity> getOne(Long id);

	PersonajeDTO update(PersonajeDTO dto,PersonajeEntity entity);
	
	PersonajeDTO detail(Long id);

	void delete(Long id);
}
