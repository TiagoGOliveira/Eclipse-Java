package br.com.senai.exercicios;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//Elabore um programa que capture 3 linhas de texto digitado pelo usu�rio
		
		Scanner sc = new Scanner(System.in);
		String s1, s2, s3;
		System.out.println("Escreva seu nome: ");
		s1 = sc.nextLine();
		System.out.println("Escreva sua idade: ");
		s2 = sc.nextLine();
		System.out.println("Escreva seu time de futebol: ");
		s3 = sc.nextLine();
		System.out.println("Informac�es Enviadas");
		System.out.println("Meu nome � " + s1 + "\nMinha idade � " + s2 + "\nMeu time do corac�o � o " + s2);

		sc.close();
		
				
	
		
	}

}
