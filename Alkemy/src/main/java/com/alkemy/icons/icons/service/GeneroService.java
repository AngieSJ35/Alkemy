package com.alkemy.icons.icons.service;

import com.alkemy.icons.icons.dto.GeneroDTO;

import java.util.List; 

public interface GeneroService {

	GeneroDTO save(GeneroDTO dto);

	List<GeneroDTO> getAllGeneros();
}
