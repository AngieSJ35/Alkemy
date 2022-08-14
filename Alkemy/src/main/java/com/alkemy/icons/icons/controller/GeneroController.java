package com.alkemy.icons.icons.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alkemy.icons.icons.dto.GeneroDTO;
import com.alkemy.icons.icons.service.GeneroService;

@RestController
@RequestMapping("generos")
public class GeneroController {

	@Autowired
	@Qualifier("genero")
	private GeneroService generoService;
	
	@GetMapping
	public ResponseEntity<List<GeneroDTO>> getAll(){
		List<GeneroDTO> generos = this.generoService.getAllGeneros();
		return ResponseEntity.ok().body(generos);
	}
	
	@PostMapping
	public ResponseEntity<GeneroDTO> save(@RequestBody GeneroDTO genero) {
		GeneroDTO generoGuardado = generoService.save(genero);
		return ResponseEntity.status(HttpStatus.CREATED).body(generoGuardado);
	}
}
