package br.com.primeiros.comandos;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		String nome;
		double media, nota1, nota2, nota3;
		
		Scanner cap = new Scanner(System.in);
		
		System.out.println("Digite o Seu Nome: ");
		nome = cap.next();
		
		System.out.println("Digite Sua Nota 1");
		nota1 = cap.nextDouble();
		System.out.println("Digite Sua Nota 2");
		nota2 = cap.nextDouble();
		System.out.println("Digite Sua Nota 3");
		nota3 = cap.nextDouble();
		
		media = (nota1 + nota2 + nota3) / 3;
		
		if (media <= 4) {
			System.out.println("Reprovado");
		} else if (media < 7){
			System.out.println("Recuperação");
		}else{
			System.out.println("Aprovado");
		}
		
		System.out.println("Sua Media e de: " + media);
		

	}

}
