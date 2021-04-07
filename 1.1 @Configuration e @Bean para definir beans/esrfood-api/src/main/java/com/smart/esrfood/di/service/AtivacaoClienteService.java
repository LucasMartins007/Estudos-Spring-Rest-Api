package com.smart.esrfood.di.service;

import com.smart.esrfood.di.model.Cliente;
import com.smart.esrfood.di.notificador.Notificador;

public class AtivacaoClienteService  {

	private Notificador notificador;
	
	public AtivacaoClienteService(Notificador notificador) {
		
		this.notificador = notificador;
		System.out.println("AtivacaoClienteService: " + notificador);
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
	
}
