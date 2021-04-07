package com.smart.esrfood.di.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.smart.esrfood.di.model.Cliente;
import com.smart.esrfood.di.notificador.NivelUrgencia;
import com.smart.esrfood.di.notificador.Notificador;
import com.smart.esrfood.di.notificador.TipoDoNotificador;

//@Component
public class AtivacaoClienteService {

	@TipoDoNotificador(NivelUrgencia.BAIXA_PRIORIDADE)
	@Autowired
	private Notificador notificador;
	
//	@PostConstruct
	public void init() {
		System.out.println("INIT " + notificador);
	}
	
//	@PreDestroy
	public void destroy() {
		System.out.println("DESTROY");
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema esta ativo!");
	}
}