package br.com.fuctura.agenda.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import br.com.fuctura.agenda.dto.ContatoRequestDTO;
import br.com.fuctura.agenda.service.IContatoService;
@Service
@Qualifier("ContatoServiceimpl")
public class ContatoServiceimpl implements IContatoService	 {
	private List<ContatoRequestDTO> contatos;
	
	
	
	public ContatoServiceimpl() {
		
		this.contatos = new ArrayList<ContatoRequestDTO>();
	}



	@Override
	
	public void salvar(ContatoRequestDTO contato) {
	this.contatos.add(contato);
	System.out.println("cadastrado com sucesso");
		
	}

}
