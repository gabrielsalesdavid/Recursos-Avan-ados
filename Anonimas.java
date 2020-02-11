package br.com.recursosavancadaos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class Anonimas {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		
		Comparator<String> comparador = new ComparacaoTamanho();
		
		palavras.add("Gabriel");
		palavras.add("Bryan");
		palavras.add("Rebeca");
		
		palavras.sort(comparador);
		
//		System.out.println(palavras);
		
		Consumer<String> consumidor = new Consumer<String>() {

			@Override
			public void accept(String s) {
				System.out.println(s);
			}
			
		};
		
		palavras.forEach(consumidor);
		
	}

}
