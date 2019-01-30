package com.flavio.cmc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.flavio.cmc.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado,Integer>{

}
