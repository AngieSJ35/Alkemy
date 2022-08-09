package com.alkemy.icons.icons.dto;

import javax.persistence.Basic;
import javax.persistence.FetchType;
import javax.persistence.Lob;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GeneroDTO {

	private Long id;
	
	private String nombre;

    private byte[] imagen;
	
}
