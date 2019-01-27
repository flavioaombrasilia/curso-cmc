package com.flavio.cmc;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.flavio.cmc.domain.Categoria;
import com.flavio.cmc.domain.Produto;
import com.flavio.cmc.repositories.CategoriaRepository;
import com.flavio.cmc.repositories.ProdutoRepository;

@SpringBootApplication
public class CmcApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(CmcApplication.class, args);
	}

	@Autowired
	private CategoriaRepository catRepo;	
	
	@Autowired
	private ProdutoRepository proRepo;
	
	@Override
	public void run(String... args) throws Exception {
		
		Categoria cat01 = new Categoria(null,"Informatica run");
		Categoria cat02 = new Categoria(null,"Escritório run");
		
		Produto p1 = new Produto(null,"Computador",100);
		Produto p2 = new Produto(null,"Impressora",300);
		Produto p3 = new Produto(null,"mouse",15600);
		
		cat01.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat02.getProdutos().addAll(Arrays.asList(p2));
		
		p1.getCategorias().addAll(Arrays.asList(cat01));
		p2.getCategorias().addAll(Arrays.asList(cat01,cat02));
		p3.getCategorias().addAll(Arrays.asList(cat01));
		
		
		catRepo.saveAll(Arrays.asList(cat01,cat02));
		proRepo.saveAll(Arrays.asList(p1,p2,p3));
		
		
	}

}

