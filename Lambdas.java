package br.com.recursosavancadaos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambdas {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();

		Comparator<String> comparador = new ComparacaoTamanho();

		palavras.add("Gabriel");
		palavras.add("Bryan");
		palavras.add("Rebeca");

		palavras.sort(comparador);

//		palavras.forEach((String s) -> {
//			System.out.println(s);
//		});

		palavras.forEach(s -> System.out.println(s));
	}

}
