package com.example.projeto_schedule.business;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
@Slf4j
public class AgendamentoService {

    /* Metodos Schedule não podem ter parametros */

    /* fixedDelay 1000 = 1 segundo */
    // @Scheduled(fixedDelay = 10000)


    @Scheduled(cron = "${spring.task.scheduling.cron}")
    public void agendaTarefas(){
        log.info("Agendado e executado em: {}", LocalDateTime.now());
    }
}


/* Opções:
@Scheduled(fixedDelay = 10000)

cron:
@Scheduled(cron = "${spring.task.scheduling.cron}")

definir as configurações no arquivo application.property ou application.yml
https://docs.oracle.com/cd/E12058_01/doc/doc.1014/e12030/cron_expressions.htm

Indicado em caso de testes, para rodar sem precisar esperar o horario de agendamento
@EventListener(ApplicationReadyEvent.class)

Link do conteúdo:
https://www.youtube.com/watch?v=7-1eYZQ8oYc
javanauta
 */