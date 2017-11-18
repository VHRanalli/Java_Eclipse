package br.com.primeiros.comandos;

import java.util.Scanner;

public class Correcao {

	public static void main(String[] args) {
		double resultado, valor;
		String pagamento, nome;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("coloque o nome do produto:");
		nome = sc.next();
		
		System.out.println("coloque o valor do produto:");
		valor = sc.nextDouble();
		
		System.out.println("Deseja pagar a vista?");
		pagamento = sc.next().toLowerCase();
		
		if(pagamento.equals("sim")){
			resultado = valor -(valor*0.045);

		}else{
			resultado = valor+(valor*0.07);
		}
			System.out.println("O valor cobrado sera de " + resultado);
	}

}
