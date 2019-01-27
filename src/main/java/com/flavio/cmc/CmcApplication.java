package com.flavio.cmc;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.flavio.cmc.domain.Categoria;
import com.flavio.cmc.repositories.CategoriaRepository;

@SpringBootApplication
public class CmcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CmcApplication.class, args);
	}

	@Autowired
	private CategoriaRepository repo;	
	
	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat01 = new Categoria(null,"Informatica run");
		Categoria cat02 = new Categoria(null,"Escritório run");
		
		repo.saveAll(Arrays.asList(cat01,cat02));
		
		
	}

}

