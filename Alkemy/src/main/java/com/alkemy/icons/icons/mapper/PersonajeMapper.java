package com.alkemy.icons.icons.mapper;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.alkemy.icons.icons.dto.GeneroDTO;
import com.alkemy.icons.icons.entity.GeneroEntity;

@Component
public class PersonajeMapper {

	public GeneroEntity generoDTO2Entity(GeneroDTO dto) {
		GeneroEntity generoEntity = new GeneroEntity();
		generoEntity.setNombre(dto.getNombre());
		return generoEntity;
	}
	
	public GeneroDTO generoEntity2DTO(GeneroEntity entity) {
		GeneroDTO dto = new GeneroDTO();
		dto.setId(entity.getId());
		dto.setNombre(entity.getNombre());
		return dto;
	}

	public List<GeneroDTO> generoEntityList2DTOList(List<GeneroEntity> entities) {
		List<GeneroDTO> dtos = new ArrayList<>();
		for(GeneroEntity entity:entities) {
			dtos.add(this.generoEntity2DTO(entity));
		}
		return dtos;
	}
}
