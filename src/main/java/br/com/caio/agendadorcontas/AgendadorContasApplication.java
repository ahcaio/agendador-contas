package br.com.caio.agendadorcontas;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import br.com.caio.agendadorcontas.controller.*;
import br.com.caio.agendadorcontas.entity.*;
import br.com.caio.agendadorcontas.service.*;

@SpringBootApplication
public class AgendadorContasApplication {

	public static void main(String[] args) {
		SpringApplication.run(AgendadorContasApplication.class, args);
	}

}
