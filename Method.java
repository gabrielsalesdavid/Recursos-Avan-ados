package br.com.recursosavancadaos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;

public class Method {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();

		palavras.add("Gabriel");
		palavras.add("Bryan");
		palavras.add("Rebeca");

//		Function<String, Integer> tamanho = new Function<String, Integer>() {
//
//			@Override
//			public Integer apply(String s) {
//				return s.length();
//			}
//
//		};
//		
//		Comparator<String> comparador = Comparator.comparing(tamanho);
//		palavras.sort(comparador);
//		System.out.println(palavras);
//
//		Comparator<String> comparador = Comparator.comparing(new Function<String, Integer>() {
//			@Override
//			public Integer apply(String s) {
//				return s.length();
//
//			}
//		});
//		
//		palavras.sort(Comparator.comparing(s -> s.length()));
//		System.out.println(palavras);
//		
//		palavras.sort(Comparator.comparing(String :: length));
//		System.out.println(palavras);
//		
//		Function<String, Integer> tamanho = String :: length;
//		Function<String, Integer> tamanho = s -> s.length();
//		Comparator<String> comaprador = Comparator.comparing(tamanho);
//		System.out.println(comaprador);
		
		palavras.forEach(System.out :: println);
	}

}
