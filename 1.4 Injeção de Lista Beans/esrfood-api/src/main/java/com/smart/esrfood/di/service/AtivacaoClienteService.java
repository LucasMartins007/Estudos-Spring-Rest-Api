package com.smart.esrfood.di.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.smart.esrfood.di.model.Cliente;
import com.smart.esrfood.di.notificador.Notificador;


@Component
public class AtivacaoClienteService {

	@Autowired
	private List<Notificador> notificadores;

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		for(Notificador notificador : notificadores) {
			notificador.notificar(cliente, "Seu cadastro no sistema esta ativo!");
		}
	}
}