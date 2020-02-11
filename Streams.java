package br.com.recursosavancadaos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Streams {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();

		cursos.add(new Curso("DB Oracle ", 50));
		cursos.add(new Curso("SQL Serve", 0));
		cursos.add(new Curso("Java para Leigos ", 55));
		cursos.add(new Curso("Data Science ", 45));
		cursos.add(new Curso("Power BI", 46));
		cursos.add(new Curso("Lógica e algoritmo de programação ", 35));

		cursos.sort(Comparator.comparing(c -> c.getAlunos()));

		cursos.sort(Comparator.comparing(Curso::getAlunos));

		cursos.forEach(System.out::println);

		cursos.forEach(c -> System.out.println(c.getNome()));		
	}

}
