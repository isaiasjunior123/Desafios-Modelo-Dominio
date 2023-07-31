package com.dvsuperior.ORM.services;



import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dvsuperior.ORM.entities.Atividade;
import com.dvsuperior.ORM.entities.Participante;
import com.dvsuperior.ORM.repository.AtividadeRepositorio;
import com.dvsuperior.ORM.repository.ParticipanteRepositorio;

@Service
public class AtividadeParticpante {

	@Autowired
	private ParticipanteRepositorio participanteRepositorio;

	@Autowired
	private AtividadeRepositorio atividadeRepositorio;

	  @Transactional
	public void associarAtividadeParticpante(Long idAtividade, Long idParticipante) {
		Participante participante = participanteRepositorio.findById(idParticipante).orElse(null);
		Atividade atividade = atividadeRepositorio.findById(idAtividade).orElse(null);

		if (participante != null && atividade != null) {

			

			participante.getAtividades().add(atividade);
			atividade.getParticipantes().add(participante);

			participanteRepositorio.save(participante);
			atividadeRepositorio.save(atividade);
		}
	}

}
