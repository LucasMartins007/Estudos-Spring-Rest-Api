package com.smart.esrfood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.smart.esrfood.di.notificador.NotificadorEmail;

@Configuration
public class NotificacaoConfig {

	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtp.elmail.com.br");
		notificador.setCaixaAlta(true);
		
		return notificador;
	}
}
