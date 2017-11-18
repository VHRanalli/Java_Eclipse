package br.com.primeiros.comandos;
/*
 * Estamos capturando a classe Scanner para ler(capturar) o que o usuario está digitando em tela de console
 */
import java.util.Scanner;

public class CalculoBase {

	public static void main(String[] args) {
		
		int valor1, valor2, resultado;
		
		/*
		 * Para utilizar a classe Scanner é necessário fazer uma instância da
		 * classe. Passando para o seu construtor uma entrada com System.in.
		 * Assim o sistema saberá que queremos ler o conteúdo digitado em
		 * tela de console.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------Bem Vindo ao Programa de Cálculo-----");
		System.out.println("Digite um Número");
		valor1 = sc.nextInt();
		
		System.out.println("Digite o Proximo Número");
		valor2 = sc.nextInt();
		
		resultado = valor1 + valor2;
		
		System.out.println("O Resultado da soma é: " + resultado);
		
		resultado = valor1 - valor2;
		
		System.out.println("O Resultado da Subtração: " + resultado);
		
		resultado = valor1 * valor2;
		
		System.out.println("O Resultado da Multiplicação é: " + resultado);
		
		resultado = valor1 / valor2;
		
		System.out.println("O Resultado da Divisão é: " + resultado);
		
		resultado = valor1 % valor2;
		
		System.out.println("O Resto da Divisão é: " + resultado);
		
		

	}

}
