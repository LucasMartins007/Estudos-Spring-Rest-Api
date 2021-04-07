package com.smart.esrfood.di.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.smart.esrfood.di.model.Cliente;
import com.smart.esrfood.di.notificador.Notificador;
// Nessa caso temos duas classes que implementam a interface Notificador, a NotificadorEmail e a NotificadorSMS.
// Para evitar que o Spring tente injetar duas classes em um instacia, estourando assim um erro.. 
// .. podemos criar uma lista de notificadores para que possamos injetar ambas as classes , ou mais caso necessário.

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
