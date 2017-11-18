package br.com.primeiros.comandos;
/*
 * Estamos capturando a classe Scanner para ler(capturar) o que o usuario est� digitando em tela de console
 */
import java.util.Scanner;

public class CalculoBase {

	public static void main(String[] args) {
		
		int valor1, valor2, resultado;
		
		/*
		 * Para utilizar a classe Scanner � necess�rio fazer uma inst�ncia da
		 * classe. Passando para o seu construtor uma entrada com System.in.
		 * Assim o sistema saber� que queremos ler o conte�do digitado em
		 * tela de console.
		 */
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("-------Bem Vindo ao Programa de C�lculo-----");
		System.out.println("Digite um N�mero");
		valor1 = sc.nextInt();
		
		System.out.println("Digite o Proximo N�mero");
		valor2 = sc.nextInt();
		
		resultado = valor1 + valor2;
		
		System.out.println("O Resultado da soma �: " + resultado);
		
		resultado = valor1 - valor2;
		
		System.out.println("O Resultado da Subtra��o: " + resultado);
		
		resultado = valor1 * valor2;
		
		System.out.println("O Resultado da Multiplica��o �: " + resultado);
		
		resultado = valor1 / valor2;
		
		System.out.println("O Resultado da Divis�o �: " + resultado);
		
		resultado = valor1 % valor2;
		
		System.out.println("O Resto da Divis�o �: " + resultado);
		
		

	}

}
