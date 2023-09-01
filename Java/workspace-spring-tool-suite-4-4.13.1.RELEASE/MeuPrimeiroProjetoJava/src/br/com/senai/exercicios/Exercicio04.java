package br.com.senai.exercicios;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
		// casas decimais conforme exemplos.
		// Fórmula da área: area = pi . raio2
		// Considere o valor de pi = 3.14159
		
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o raio do círculo: ");
		double raio = sc.nextDouble();
		sc.close();
		double pi = 3.14159;
		double area = pi * Math.pow(raio, 2.0);
	
		System.out.println("Resultado");
		System.out.printf("A área do circulo é de %.4f", area);

	}

}
