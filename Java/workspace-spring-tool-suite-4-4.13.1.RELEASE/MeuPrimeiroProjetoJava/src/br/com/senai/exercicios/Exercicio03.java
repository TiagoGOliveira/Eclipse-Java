package br.com.senai.exercicios;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero: ");
		double s1 = sc.nextDouble();
		System.out.println("Escreva o n�mero a ser subtraido do anterior: ");
		double s2 = sc.nextDouble();

		sc.close();
		
		System.out.println("Resultado da Subtrac�o");
		System.out.println("A soma entre os n�meros � de " + (s1 + s2));
		System.out.println("A subtrac�o entre os n�meros � de " + (s1 - s2));
		System.out.println("A divis�o entre os n�meros � de " + (s1 / s2));
		System.out.println("A multiplicac�o entre os n�meros � de " + (s1 * s2));
	}

}
