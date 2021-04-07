package com.smart.esrfood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.smart.esrfood.di.notificador.NotificadorEmail;
import com.smart.esrfood.di.service.AtivacaoClienteService;

//@Configuration
public class elConfig {
	
	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificador = new NotificadorEmail("smtp.elmail.com.br");
		notificador.setCaixaAlta(true);
		
		return notificador;
	}
	
	@Bean
	public AtivacaoClienteService ativacaoClienteService() {
		return new AtivacaoClienteService(notificadorEmail());
	}
	
}
