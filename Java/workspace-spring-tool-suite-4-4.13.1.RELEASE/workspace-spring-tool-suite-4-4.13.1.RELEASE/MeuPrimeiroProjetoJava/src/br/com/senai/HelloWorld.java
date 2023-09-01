package br.com.senai;

import java.util.Locale;

public class HelloWorld {

	public static void main(String[] args) {
		
//		int idade = 35;
//		int numero1 = 40;
//		int numero2 = 5;
//	
//		
//		System.out.println("Hello World | Livrei-me da maldicao!");
//		
//		System.out.println("A minha idade é " + idade + " anos");
//		System.out.println("=====================");
//		System.out.println("A SOMA DE " + numero1 + " + " + numero2 + " = " + (numero1 + numero2));
//
//		System.out.println("A SUBTRACÃO DE " + numero1 + " - " + numero2 + " = " + (numero1 - numero2));
//
//		System.out.println("A DIVISÃO DE " + numero1 + " / " + numero2 + " = " + (numero1 / numero2));
//
//		System.out.println("A MULTIPLICACÃO DE " + numero1 + " * " + numero2 + " = " + (numero1 * numero2));
//
//		System.out.println("O RESTO DA DIVISÃO DE " + numero2 + " % " + numero1 + " = " + (numero2 % numero1));
//
//		System.out.println("=====================");
//	
//		System.out.println(20 * 3 / 5 % 6 + 22 - 2);
//		System.out.println(20.0 % 3.0 / 5.0 * 6.0 + 22.0 - 2.0); // Ele só dá resultado decimal se os numeros forem decimais
//		
//		System.out.println(60 / (3 + 2) * 4); // Resultado deve ser 48
//		System.out.println(60 * (3 + 2) / 4); // Resultado deve ser 75
//		System.out.println(60 / ((2+3) * 4)); // Resultado deve ser 3
//		
//		Sintaxe
//		 <tipo> <nome> = <valor inicial>
//		 codigo System.out.print() sem ln imprime na mesma linha
//		
//		Locale.getDefault()
//		
//		double x = 10.35784;
//		
//		System.out.println(x);
//		System.out.printf("%.2f\n", x); // \n é o codigo para pular para a proxima linha, pois o printf nao pula
//		System.out.println(3.6 * 2);
//		System.out.printf("%.3f\n", 6d); // a letra d pode ser f tambem, indica o tipo de codigo ex. double
//		
//		String reais = "reais";
//		String nome = "Maiza";
//		double renda = 10000.00;
//		
//		System.out.printf("%s tem %d anos e ganha R$ %.2f %s%n", nome, idade, renda, reais); // printf aceita a formatacao de selecionar o numero de casa
//		System.out.println(nome + " tem " + idade + " anos e ganha R$ " + renda + " reais");
//		
//		// d é inteiro, s é string e f é numero decimal - ao lado da %
//		
		
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
		System.out.printf("\nUS decimal point: %.3f", medida);
		
	}

}
