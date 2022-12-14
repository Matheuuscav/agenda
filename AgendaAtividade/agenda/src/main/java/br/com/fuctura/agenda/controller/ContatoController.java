package br.com.fuctura.agenda.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.fuctura.agenda.dto.ContatoRequestDTO;
import br.com.fuctura.agenda.dto.ContatoResponseDTO;
import br.com.fuctura.agenda.service.IContatoService;

@RestController
@RequestMapping("/contato")
public class ContatoController {

	private final IContatoService service ;

	
	/*
	 * C - create R - read U - update D - delete
	 * 
	 */
	@Autowired
	public ContatoController(@Qualifier("ContatoServiceimpl") IContatoService service) {
		this.service = service;
	}
	
	// @RequestMapping(path = "/cadastrar", method = RequestMethod.POST)
	@PostMapping(path = "/cadastrar")
	@ResponseBody
	public ResponseEntity<ContatoResponseDTO> cadastrar(@RequestBody ContatoRequestDTO request) {
		service.salvar(request);
		System.out.println("Kratos tem um combate lixo realmente");
		return  ResponseEntity.status(HttpStatus.CREATED).build();
	}
	
}
