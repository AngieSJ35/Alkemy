package com.alkemy.icons.icons.dto;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.FetchType;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;

import com.alkemy.icons.icons.entity.PeliculaEntity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PersonajeDTO {

private String nombre;
	
	private int edad;
	
	private Long peso;
	
	private String historia;
	
	@Lob
    @Basic(fetch = FetchType.LAZY)
    private byte[] imagen;
	
	@ManyToMany(mappedBy = "personajes", cascade = CascadeType.ALL)
	private List<PeliculaEntity> peliculas = new ArrayList<>();
	
	
	
}
