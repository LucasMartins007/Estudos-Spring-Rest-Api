package com.smart.esrfood;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import com.smart.esrfood.di.notificador.Notificador;
import com.smart.esrfood.di.service.AtivacaoClienteService;

@Configuration
public class ServiceConfig {

	@Bean
	public AtivacaoClienteService ativacaoClienteService(Notificador notificador) {
		return new AtivacaoClienteService(notificador);
	}
}
