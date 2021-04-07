package com.smart.esrfood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.smart.esrfood.di.model.Cliente;
import com.smart.esrfood.di.notificador.Notificador;


@Component
public class AtivacaoClienteService {

	@Qualifier("urgente")
	@Autowired
	private Notificador notificador;

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema esta ativo!");
	}
}