package br.com.recursosavancadaos;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ForEach {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();
		
		Consumer<String> consumidor = new MostreNaLinha();
		
		System.out.println(palavras);
		
		palavras.add("Gabriel");
		palavras.add("Bryan");
		palavras.add("Rebeca");
		
//		for(int i = 0; i < palavras.size(); i++) {
//			System.out.println(palavras.get(i));
//		}
//		
//		for(String p : palavras) {
//			System.out.println(p);
//		}
		
		palavras.forEach(consumidor);
	}

}
