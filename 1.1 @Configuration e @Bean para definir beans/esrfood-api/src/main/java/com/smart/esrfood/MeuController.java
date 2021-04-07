package com.smart.esrfood;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.smart.esrfood.di.model.Cliente;
import com.smart.esrfood.di.service.AtivacaoClienteService;

@Controller
public class MeuController {
	
	private AtivacaoClienteService ativacaoClienteService;
	
	public MeuController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
		System.out.println("Meu Controller: " + ativacaoClienteService);
	}

	
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		Cliente joao = new Cliente("João", "joao@xyz.com", "459998856");
		ativacaoClienteService.ativar(joao);
		return  "hello!";
	}
}
