package com.dvsuperior.ORM.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dvsuperior.ORM.entities.Participante;


@Repository
public interface ParticipanteRepositorio extends JpaRepository<Participante , Long> {

}
