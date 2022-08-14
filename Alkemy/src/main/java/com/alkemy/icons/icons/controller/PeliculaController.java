package com.alkemy.icons.icons.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alkemy.icons.icons.dto.PersonajeDTO;
import com.alkemy.icons.icons.entity.PersonajeEntity;
import com.alkemy.icons.icons.service.PersonajeService;


@RestController
@RequestMapping("personajes")
public class PeliculaController {

	@Autowired
	@Qualifier("personaje")
	private PersonajeService personajeService;
	
	@GetMapping
	public ResponseEntity<List<PersonajeDTO>> getAll(){
		List<PersonajeDTO> personajes = this.personajeService.getAllPersonajes();
		return ResponseEntity.ok().body(personajes);
	}
	
	@PostMapping
	public ResponseEntity<PersonajeDTO> save(@RequestBody PersonajeDTO personaje) {
		PersonajeDTO personajeGuardado = personajeService.save(personaje);
		return ResponseEntity.status(HttpStatus.CREATED).body(personajeGuardado);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<PersonajeDTO> edit(@PathVariable("id")Long id, @RequestBody PersonajeDTO personaje) {
		PersonajeEntity entity = personajeService.getOne(id).get();
		PersonajeDTO personajeActualizado = personajeService.update(personaje, entity);
		return ResponseEntity.status(HttpStatus.OK).body(personajeActualizado);
	}
	
	@GetMapping("/detail/{id}")
	public ResponseEntity<PersonajeDTO> detail(@PathVariable("id")Long id) {
		PersonajeDTO personaje = personajeService.detail(id);
 		return ResponseEntity.ok(personaje);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<Void> delete(@PathVariable Long id) {
		this.personajeService.delete(id);
		return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
	}
}
