package com.example.projeto_schedule;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class ProjetoScheduleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoScheduleApplication.class, args);
	}

}
