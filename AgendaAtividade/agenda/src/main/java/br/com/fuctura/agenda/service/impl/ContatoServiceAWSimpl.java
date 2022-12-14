package br.com.fuctura.agenda.service.impl;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import br.com.fuctura.agenda.dto.ContatoRequestDTO;
import br.com.fuctura.agenda.service.IContatoService;
@Service
@Qualifier("ContatoServiceAWSImpl")
public class ContatoServiceAWSimpl implements IContatoService{

	@Override
	public void salvar(ContatoRequestDTO contato) {
	
		
	}

}
