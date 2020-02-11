package br.com.recursosavancadaos;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Revisao {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		
		cursos.add(new Curso("DB Oracle ", 50));
		cursos.add(new Curso("SQL Serve", 0));
		cursos.add(new Curso("Java para Leigos ", 55));
		cursos.add(new Curso("Data Science ", 45));
		cursos.add(new Curso("Power BI", 46));
		cursos.add(new Curso("Lógica e algoritmo de programação ", 35));
		
		cursos.stream().filter(c -> c.getAlunos() >= 45).forEach(c -> System.out.println(c.getNome()));
		
		cursos.stream().filter(c -> c.getAlunos() >= 45).forEach(System.out::println);
	}

}
