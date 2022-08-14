package com.alkemy.icons.icons.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="personaje")
@Getter
@Setter
@SQLDelete(sql = "UPDATE personaje SET deleted = true where id=?")
@Where(clause = "deleted=false")
public class PersonajeEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private String nombre;
	
	private Integer edad;
	
	private Long peso;
	
	private String historia;
	
    private String imagen;
    
    private boolean deleted = Boolean.FALSE;
    
	@ManyToMany(mappedBy = "personajes", cascade = CascadeType.ALL)
	private List<PeliculaEntity> peliculas = new ArrayList<>();
	
	
	
}
