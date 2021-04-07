package com.smart.esrfood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.smart.esrfood.di.model.Cliente;
import com.smart.esrfood.di.notificador.NivelUrgencia;
import com.smart.esrfood.di.notificador.Notificador;
import com.smart.esrfood.di.notificador.TipoDoNotificador;

@Component
public class AtivacaoClienteService {

	@TipoDoNotificador(NivelUrgencia.BAIXA_PRIORIDADE)
	@Autowired
	private Notificador notificador;

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		notificador.notificar(cliente, "Seu cadastro no sistema esta ativo!");
	}
}