package com.smart.esrfood.di.notificador;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.smart.esrfood.di.model.Cliente;

@Qualifier("normal")
@Component
public class NotificadorSMS implements Notificador {
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do telefone %s: %s\n", 
				cliente.getNome(), cliente.getTelefone(), mensagem);
	}
}