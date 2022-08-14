package com.alkemy.icons.icons.service.impl;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alkemy.icons.icons.dto.PersonajeDTO;
import com.alkemy.icons.icons.entity.PersonajeEntity;
import com.alkemy.icons.icons.mapper.PersonajeMapper;
import com.alkemy.icons.icons.repository.PersonajeRepository;
import com.alkemy.icons.icons.service.PersonajeService;

@Service("personaje")
public class PersonajeServiceImpl implements PersonajeService{
	
	@Autowired
	private PersonajeMapper personajeMapper;
	
	@Autowired
	private PersonajeRepository personajeRepository;
	
	public PersonajeDTO save(PersonajeDTO dto) {
		PersonajeEntity entity = personajeMapper.personajeDTO2Entity(dto);
		PersonajeEntity entitySaved = personajeRepository.save(entity);
		PersonajeDTO result = personajeMapper.personajeEntity2DTO(entitySaved, true);
		System.out.println("Guardar genero");
		return result;
	}

	public List<PersonajeDTO> getAllPersonajes() {
		List<PersonajeEntity> entities = personajeRepository.findAll();
		List<PersonajeDTO> result = personajeMapper.personajeEntityList2DTOList(entities);
		return result;
	}

	public Optional<PersonajeEntity> getOne(Long id) {
		return personajeRepository.findById(id);
	}
	
	public Optional<PersonajeEntity> getByName(String nombre) {
		return personajeRepository.findByNombre(nombre);
	}

	public PersonajeDTO update(PersonajeDTO dto, PersonajeEntity entity) {
		entity.setEdad(dto.getEdad());
		entity.setHistoria(dto.getHistoria());
		entity.setImagen(dto.getImagen());
		entity.setNombre(dto.getNombre());
		entity.setPeso(dto.getPeso());
		entity.getPeliculas();
		personajeRepository.save(entity);
		PersonajeDTO personajeActualizado = personajeMapper.personajeEntity2DTO(entity, true);
		return personajeActualizado;
	}

	public PersonajeDTO detail(Long id) {
		PersonajeEntity entity = personajeRepository.getReferenceById(id);
		PersonajeDTO personaje = personajeMapper.personajeEntity2DTO(entity, true);
		return personaje;
	}
	
	public void delete(Long id) {
		this.personajeRepository.deleteById(id);
	}
}
