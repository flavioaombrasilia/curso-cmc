package com.flavio.cmc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.flavio.cmc.domain.Categoria;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResources {

	@RequestMapping(method=RequestMethod.GET)
	public List<Categoria> listar() {
		
		Categoria cat01 = new Categoria(1, "Informática");
		Categoria cat02 = new Categoria(2, "Escritório");
		Categoria cat03 = new Categoria(3, "Limpeza");
		
	    List<Categoria> lista = new ArrayList<>();
	    lista.add(cat01);
	    lista.add(cat02);
	    lista.add(cat03);
				
		return lista;
	}
}
