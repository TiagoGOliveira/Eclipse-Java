package br.com.senai.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro número: ");
		double s1 = sc.nextDouble();
		System.out.println("Escreva o número a ser subtraido do anterior: ");
		double s2 = sc.nextDouble();

		sc.close();
		
		System.out.println("Resultado da Subtracão");
		System.out.println("A soma entre os números é de " + (s1 + s2));
		System.out.println("A subtracão entre os números é de " + (s1 - s2));
		System.out.println("A divisão entre os números é de " + (s1 / s2));
		System.out.println("A multiplicacão entre os números é de " + (s1 * s2));
	}

}
