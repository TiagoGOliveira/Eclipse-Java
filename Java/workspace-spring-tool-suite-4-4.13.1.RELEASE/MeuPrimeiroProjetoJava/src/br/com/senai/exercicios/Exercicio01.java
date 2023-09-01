package br.com.senai.exercicios;

import java.util.Locale;

public class Exercicio01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String produto1 = "Computer";
		String produto2 = "Office Desk";
		
		int age = 30;
		int code = 5290;
		char genero = 'F';
		
		double preco1 = 2100.0;
		double preco2 = 650.50;
		double medida = 53.234567;
		
		System.out.println("Products:");
		System.out.printf(produto1 + ", which price is $ %.2f \n", preco1);
		System.out.printf(produto2 + ", which price is $ %.2f \n", preco2);
		System.out.printf("\nRecord: %d years old, code %s and gender: %s \n", age, code, genero);
		System.out.printf("\nMeasure with eight decimal places: %.8f", medida);
		System.out.printf("\nRouded (three decimal places): %.3f", medida);
		Locale.setDefault(Locale.US); // Serve para trocar a vigula por ponto, modelo americano
		System.out.printf("\nUS decimal point: %.3f", medida);
		
		System.out.println(); // esse formato vazio entre parentes, imprime uma linha vazia
		// o \n no inicio ou final de um cõdigo acrescenta uma linha
	}

}
