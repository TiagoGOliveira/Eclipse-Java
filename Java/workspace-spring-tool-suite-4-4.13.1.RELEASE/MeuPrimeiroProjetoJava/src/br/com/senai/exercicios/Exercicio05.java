package br.com.senai.exercicios;

import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferen�a do produto
		//de A e B pelo produto de C e D segundo a f�rmula: DIFERENCA = (A * B - C * D).
	
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o primeiro n�mero: ");
		int s1 = sc.nextInt();
		System.out.println("Digite o segundo n�mero: ");
		int s2 = sc.nextInt();
		System.out.println("Digite o terceiro numero: ");
		int s3 = sc.nextInt();
		System.out.println("Digite o quarto numero: ");
		int s4 = sc.nextInt();
		
		sc.close();
		
		System.out.println("Resultados dos Produtos Entre os Numeros");
		System.out.println("A diferenca entre os produtos � de " + (s1 * s2 - s3 * s4));

		
	}

}
