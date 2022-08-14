package com.alkemy.icons.icons.dto;

import java.util.ArrayList;
import java.util.List;

import com.alkemy.icons.icons.entity.PeliculaEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonajeDTO {

	
	private Long id;
	private String nombre;
	private Integer edad;
	private Long peso;
	private String historia;
    private String imagen;
	private List<PeliculaEntity> peliculas = new ArrayList<>();
	
	
}
