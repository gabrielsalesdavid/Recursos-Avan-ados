package br.com.recursosavancadaos;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamThread {

	public static void main(String[] args) {
		List<Curso> cursos = new ArrayList<Curso>();
		
		cursos.add(new Curso("DB Oracle ", 50));
		cursos.add(new Curso("SQL Serve", 0));
		cursos.add(new Curso("Java para Leigos ", 55));
		cursos.add(new Curso("Data Science ", 45));
		cursos.add(new Curso("Power BI", 46));
		cursos.add(new Curso("Lógica e algoritmo de programação ", 35));
		
		cursos.parallelStream()
		.filter(c -> c.getAlunos() >= 20)
		.collect(Collectors.toMap(c -> c.getNome(), c -> c.getAlunos()))
		.forEach((nome, alunos) -> System.out.println(nome + " tem " + alunos + " alunos"));
	}

}
