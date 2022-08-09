package com.alkemy.icons.icons.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alkemy.icons.icons.dto.GeneroDTO;
import com.alkemy.icons.icons.entity.GeneroEntity;
import com.alkemy.icons.icons.mapper.GeneroMapper;
import com.alkemy.icons.icons.repository.GeneroRepository;
import com.alkemy.icons.icons.service.GeneroService;

@Service
public class GeneroServiceImpl implements GeneroService{
	
	@Autowired
	private GeneroMapper generoMapper;
	@Autowired
	private GeneroRepository generoRepository;
	
	public GeneroDTO save(GeneroDTO dto) {
		GeneroEntity entity = generoMapper.generoDTO2Entity(dto);
		GeneroEntity entitySaved = generoRepository.save(entity);
		GeneroDTO result = generoMapper.generoEntity2DTO(entitySaved);
		System.out.println("Guardar genero");
		return result;
	}

	@Override
	public List<GeneroDTO> getAllGeneros() {
		List<GeneroEntity> entities = generoRepository.findAll();
		List<GeneroDTO> result = generoMapper.generoEntityList2DTOList(entities);
		return result;
	}

}
