package com.smart.esrfood.di.notificador;

import com.smart.esrfood.di.model.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}