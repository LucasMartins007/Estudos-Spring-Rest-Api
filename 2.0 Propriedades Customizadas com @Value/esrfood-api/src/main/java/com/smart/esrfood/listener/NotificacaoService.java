package com.smart.esrfood.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.smart.esrfood.di.notificador.NivelUrgencia;
import com.smart.esrfood.di.notificador.Notificador;
import com.smart.esrfood.di.notificador.TipoDoNotificador;
import com.smart.esrfood.di.service.ClienteAtivadoEvent;

@Component
public class NotificacaoService {
	
	@TipoDoNotificador(NivelUrgencia.BAIXA_PRIORIDADE)
	@Autowired
	private Notificador notificador;
	
	@EventListener
	public void clienteAtivadoListener(ClienteAtivadoEvent event) {
		notificador.notificar(event.getCliente()," Seu cadastro no sistema agora está ativo.");
	}
}
