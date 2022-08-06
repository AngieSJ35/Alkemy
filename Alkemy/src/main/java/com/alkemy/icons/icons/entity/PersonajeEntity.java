package com.alkemy.icons.icons.entity;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="personaje")
@Getter
@Setter
public class PersonajeEntity {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
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
