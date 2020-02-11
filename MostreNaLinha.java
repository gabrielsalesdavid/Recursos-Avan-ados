package br.com.recursosavancadaos;

import java.util.function.Consumer;

public class MostreNaLinha implements Consumer<String> {

	@Override
	public void accept(String s) {
		System.out.println(s);
	}
	
}
