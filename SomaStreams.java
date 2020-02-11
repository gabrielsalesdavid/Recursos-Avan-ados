package br.com.recursosavancadaos;

import java.util.ArrayList;
import java.util.List;

public class SomaStreams {

	public static void main(String[] args) {

		List<Curso> cursos = new ArrayList<Curso>();
		
		cursos.add(new Curso("DB Oracle ", 50));
		cursos.add(new Curso("SQL Serve", 0));
		cursos.add(new Curso("Java para Leigos ", 55));
		cursos.add(new Curso("Data Science ", 45));
		cursos.add(new Curso("Power BI", 46));
		cursos.add(new Curso("Lógica e algoritmo de programação ", 35));
		
		int soma = cursos.parallelStream().filter(c -> c.getAlunos() >= 10).mapToInt(Curso::getAlunos).sum();
		System.out.println("A soma total de alunos de todos os cursos é: " + soma);
	}

}
