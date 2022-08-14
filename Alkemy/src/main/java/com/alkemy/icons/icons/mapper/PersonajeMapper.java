package com.alkemy.icons.icons.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.alkemy.icons.icons.dto.PersonajeDTO;
import com.alkemy.icons.icons.entity.PersonajeEntity;

@Component
public class PersonajeMapper {

	public PersonajeEntity personajeDTO2Entity(PersonajeDTO dto) {
		PersonajeEntity personajeEntity = new PersonajeEntity();
		personajeEntity.setNombre(dto.getNombre());
		personajeEntity.setEdad(dto.getEdad());
		personajeEntity.setPeso(dto.getPeso());
		personajeEntity.setHistoria(dto.getHistoria());
		personajeEntity.setImagen(dto.getImagen());
		// TODO: personajeEntity.setPeliculas(dto.setPeliculas(null));
		return personajeEntity;
	}
	public PersonajeDTO personajeEntity2DTO(PersonajeEntity entity, boolean loadPeliculas) {
		PersonajeDTO personajeDTO = new PersonajeDTO();
		personajeDTO.setId(entity.getId());
		personajeDTO.setNombre(entity.getNombre());
		personajeDTO.setEdad(entity.getEdad());
		personajeDTO.setPeso(entity.getPeso());
		personajeDTO.setHistoria(entity.getHistoria());
		personajeDTO.setImagen(entity.getImagen());
		// TODO: personajeEntity.setPeliculas(dto.setPeliculas(null));
		return personajeDTO;
	}
	public List<PersonajeDTO> personajeEntityList2DTOList(List<PersonajeEntity> entities) {
		List<PersonajeDTO> dtos = new ArrayList<>();
		for(PersonajeEntity entity:entities) {
			dtos.add(this.personajeEntity2DTO(entity, true));
		}
		return dtos;
	}
}
