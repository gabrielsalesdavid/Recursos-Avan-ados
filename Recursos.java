package br.com.recursosavancadaos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Recursos {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		
		Comparator<String> comparador = new ComparacaoTamanho();
		
		palavras.add("Gabriel");
		palavras.add("Bryan");
		palavras.add("Rebeca");
		
		Collections.sort(palavras);
		
//		for(int i = 0; i < palavras.size(); i++) {
//			System.out.println("A palavra " + palavras.get(i) + " tem tamanho " + palavras.get(i).length());
//		}
		
		palavras.sort(comparador);
		
		System.out.println(palavras);
	}

}
