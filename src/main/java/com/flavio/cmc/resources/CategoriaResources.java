package com.flavio.cmc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.flavio.cmc.domain.Categoria;
import com.flavio.cmc.services.CategoriaServices;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResources {

	@Autowired
	private CategoriaServices servico;
	
	@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public ResponseEntity<?> localizar(@PathVariable Integer id) {
		
		
		Categoria obj = servico.buscar(id);
		return ResponseEntity.ok(obj);
	
		
	}
}
