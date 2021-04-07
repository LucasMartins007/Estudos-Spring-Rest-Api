package com.smart.esrfood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.smart.esrfood.di.model.Cliente;
import com.smart.esrfood.di.notificador.Notificador;

	// Quando adicionamos somente o @Autowired, o spring interpreta que essa instância é obrigatória para a..
	// .. classe. 
	// nesse caso, se o notificador viesse nulo, daria um erro de compilação.
	
	// Quando adicionamos o required, definimos se essa instância é obrigatoria para a classe ou não.
	
	// nesse caso, tratamos mais abaixo caso o notificador for nullo para exibir uma mensagem melhor..
	// ..trabalhada para o usuário
	
	// na prática, se o @Component do notificadorEmail esta comentado, ou seja, ele irá ser..
	// ..instanciado nessa classe com valor nulo, e ao invés de estourar um erro de compilação..
	// ..ele trata o erro, e informa que não existe o notificador.
@Component
public class AtivacaoClienteService {

	
	@Autowired(required = false)
	private Notificador notificador;

	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		if(notificador != null) {
			notificador.notificar(cliente, "Seu cadastro no sistema esta ativo!");
		}else {
			System.out.println("Não existe notificador, mas cliente foi ativado");
		}
	}
}