package com.dvsuperior.ORM;

import com.dvsuperior.ORM.services.AtividadeParticpante;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;



@SpringBootApplication
public class ObjetoRelacionalApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(ObjetoRelacionalApplication.class, args);

        // Obtém uma instância do serviço AtividadeParticipante do contexto Spring
        AtividadeParticpante atividadeParticpanteService = context.getBean(AtividadeParticpante.class);

        // Chama o método que associa participantes a atividades
        atividadeParticpanteService.associarAtividadeParticpante(1L, 1L);
        atividadeParticpanteService.associarAtividadeParticpante(1L, 2L);
        atividadeParticpanteService.associarAtividadeParticpante(2L, 1L);
        atividadeParticpanteService.associarAtividadeParticpante(3L, 1L);
        atividadeParticpanteService.associarAtividadeParticpante(3L, 2L);
        atividadeParticpanteService.associarAtividadeParticpante(4L, 2L);

        // Fechar o contexto após a conclusão das operações
        context.close();
    }

}
