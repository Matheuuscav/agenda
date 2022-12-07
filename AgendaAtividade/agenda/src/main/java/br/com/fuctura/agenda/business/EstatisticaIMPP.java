package br.com.fuctura.agenda.business;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;
@Primary
@Service
public class EstatisticaIMPP implements Estatistica{
  
	public  EstatisticaIMPP(){
		System.out.println("Construiu a estatistica");
		}
	@Override
	public String reverse(String input) {
		return new StringBuilder(input).reverse().toString();
		
	}
}
