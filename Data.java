package br.com.recursosavancadaos;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Data {

	public static void main(String[] args) {
		LocalDate hoje = LocalDate.now();
		System.out.println(hoje);
		
		LocalDate ano_novo = LocalDate.of(2021, Month.JANUARY, 1);		
		System.out.println(ano_novo);
		
		int ano = ano_novo.getYear();
		Month mes = ano_novo.getMonth();
		int dia =ano_novo.getDayOfMonth();
		System.out.println("O ano novo ser� em " + dia + " do " + mes + " no " + ano);
		
		Period periodo = Period.between(hoje, ano_novo);
		System.out.println(periodo);
		
		System.out.println("Faltam " 
		+ periodo.getYears() 
		+ " anos " + periodo.getMonths() 
		+ " meses e " + periodo.getDays() 
		+ " dias para o ano novo.");
		
		DateTimeFormatter formatador = DateTimeFormatter.ofPattern("dd/MM/yyy");
		System.out.println(formatador);
		
		LocalDateTime agora = LocalDateTime.now();
		System.out.println(agora);
		
		DateTimeFormatter formatador_horas = DateTimeFormatter.ofPattern("dd/MM/yyy HH:mm:ss");
		System.out.println(agora.format(formatador_horas));
	}

}
