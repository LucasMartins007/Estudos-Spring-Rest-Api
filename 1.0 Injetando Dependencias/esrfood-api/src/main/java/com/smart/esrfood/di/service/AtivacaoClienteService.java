package com.smart.esrfood.di.service;

import org.springframework.stereotype.Component;

import com.smart.esrfood.di.model.Cliente;
import com.smart.esrfood.di.notificador.Notificador;

// A injeção de dependencias do Spring permite que façamos a 
// implementação somente da interface, e o Spring irá reconhecer
// qual classe deverá implementar.

// nesse caso, temos a classe NotificadorEmail, 
// que esta implementa a interface Notificador,
// nesse caso, podemos implementar somente a interface, 
// que o Spring irá reconhecer que deve instancia a classe NotificadorEmail tambem.

@Component
public class AtivacaoClienteService {

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
