package com.smart.esrfood.di.notificador;

import org.springframework.stereotype.Component;

import com.smart.esrfood.di.model.Cliente;

@Component
public class NotificadorEmail implements Notificador {
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
}