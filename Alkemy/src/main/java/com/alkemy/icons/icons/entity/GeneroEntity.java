package com.alkemy.icons.icons.entity;

import javax.persistence.Basic;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name="genero")
@Getter
@Setter
public class GeneroEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Long id;
	
	private String nombre;
	
	@Lob
   	@Basic(fetch = FetchType.LAZY)
    	private byte[] imagen;
	

}
