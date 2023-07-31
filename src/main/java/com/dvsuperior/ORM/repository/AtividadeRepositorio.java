package com.dvsuperior.ORM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dvsuperior.ORM.entities.Atividade;

@Repository
public interface AtividadeRepositorio extends JpaRepository<Atividade , Long> {

}
