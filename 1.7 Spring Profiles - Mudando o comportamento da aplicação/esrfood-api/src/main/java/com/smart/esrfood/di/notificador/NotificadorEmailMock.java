package com.smart.esrfood.di.notificador;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.smart.esrfood.di.model.Cliente;

@Profile("dev")
@TipoDoNotificador(NivelUrgencia.BAIXA_PRIORIDADE)
@Component
public class NotificadorEmailMock  implements Notificador{

	public NotificadorEmailMock() {
		System.out.println("Notificador MOCK: ");
	}
	
	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("MOCK: Notificação seria enviada para %s através do e-mail %s: %s \n",
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
	
}
