package br.com.recursosavancadaos;

import java.util.ArrayList;
import java.util.List;

public class ComparandoPorLambda {

	public static void main(String[] args) {
		List<String> palavras = new ArrayList<String>();

		palavras.add("Gabriel");
		palavras.add("Bryan");
		palavras.add("Rebeca");

//		palavras.sort((s1, s2) -> {
//			if (s1.length() < s2.length()) {
//				return -1;
//			}
//			if (s1.length() > s2.length()) {
//				return 1;
//			}
//			return 0;
//		});
		palavras.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));

		palavras.forEach(s -> System.out.println(s));
	}

}
