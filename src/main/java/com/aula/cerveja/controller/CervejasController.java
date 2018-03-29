package com.aula.cerveja.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.aula.cerveja.model.Cerveja;

@Controller
@RequestMapping(value = "/cervejas")
public class CervejasController {

	@RequestMapping("/novo")
	public String novo() {
		return "cerveja/CadastroCerveja";
	}

	@RequestMapping(value = "/novo", method = RequestMethod.POST)
	public String cadastrar(@Valid Cerveja cerveja, BindingResult result) {

		System.out.println("Cadastrar() invocado");
		
		if (result.hasErrors()) {
			System.out.println(">>> A validação detectou erros!");
		} else {
			System.out.println(">>> A validação deu certo!");
			System.out.println("SKU: " + cerveja.getSku());
			System.out.println("Nome: " + cerveja.getNome());
		}
		
		
		return "cerveja/CadastroCerveja";

	}

}
