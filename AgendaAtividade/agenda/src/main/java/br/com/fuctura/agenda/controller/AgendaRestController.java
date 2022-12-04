package br.com.fuctura.agenda.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.fuctura.agenda.dto.ContatoRequestDTO;
import br.com.fuctura.agenda.dto.ContatoResponseDTO;

@RestController()
@RequestMapping(path = "/agenda")
public class AgendaRestController {

	@PostMapping(path = "//cadastrar")
	public ContatoResponseDTO cadastro(@RequestBody ContatoRequestDTO request) {

		ContatoResponseDTO response = new ContatoResponseDTO();

		response.setMensagem("Cadastrado com sucesso!");
		return response;

	}

	@GetMapping(path = "//pesquisar")
	public ContatoResponseDTO procurar() {

		ContatoResponseDTO response = new ContatoResponseDTO();

		response.setMensagem("Cadastrado com sucesso!");
		return response;

	}

	@PostMapping(path = "/estatistica/Completa")
	public ContatoResponseDTO EstatisticaCompleta(@RequestBody ContatoRequestDTO request) {

		int QtoCaracteres = request.getNome().length();

		double DiasVividos;

		String str = request.getNome();

		StringBuffer sbr = new StringBuffer(str);

		sbr.reverse();

		DiasVividos = request.getIdade() * 365.25;

		ContatoResponseDTO response = new ContatoResponseDTO();

		response.setMensagem("As Estatisticas completas são Quantidade de Caracteres do seu nome: " + QtoCaracteres
				+ " / Seu nome Invertido:" + sbr + " / e a quantos dias está vivo: " + DiasVividos);
		return response;
	}

	@PostMapping(path = "/estatistica/resumida")
	public ContatoResponseDTO EstatisticaResumida(@RequestBody ContatoRequestDTO request) {

		int QtoCaracteres = request.getNome().length();

		String str = request.getNome();

		StringBuffer sbr = new StringBuffer(str);

		sbr.reverse();

		ContatoResponseDTO response = new ContatoResponseDTO();

		response.setMensagem("As Estatisticas completas são Quantidade de Caracteres do seu nome: " + QtoCaracteres
				+ " / Seu nome Invertido: " + sbr);
		return response;
	}
}
