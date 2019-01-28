package com.flavio.cmc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.flavio.cmc.domain.Categoria;
import com.flavio.cmc.repositories.CategoriaRepository;
import com.flavio.cmc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaServices {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		
		
		return obj.orElseThrow(() -> new ObjectNotFoundException("Categoria não encontrada. ID: "+id
					+" , Tipo: "+ Categoria.class.getName() )); 
		
		
		
	}
	
}
