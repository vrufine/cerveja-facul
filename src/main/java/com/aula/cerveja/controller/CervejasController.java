package com.aula.cerveja.controller;

import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.aula.cerveja.model.Cerveja;

@Controller
@RequestMapping(value = "/cervejas")
public class CervejasController {

	@RequestMapping("/novo")
	public String novo() {
		return "cerveja/CadastroCerveja";
	}

	@RequestMapping(value = "/novo", method = RequestMethod.POST)
	public String cadastrar(
		@Valid Cerveja cerveja,
		BindingResult result,
		Model model,
		RedirectAttributes attributes
	) {
		if (result.hasErrors()) {
			model.addAttribute("mensagem", "Erro no formulário!");
			return "cerveja/CadastroCerveja";
		}
		attributes.addFlashAttribute("mensagem", "Salvo com sucesso!");
		return "redirect:/cervejas/novo";

	}

}
