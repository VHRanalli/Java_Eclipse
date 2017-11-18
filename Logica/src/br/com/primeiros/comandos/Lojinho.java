package br.com.primeiros.comandos;

import java.util.Scanner;

public class Lojinho {

	public static void main(String[] args) {
		
		
		double  valor, parcela;
		
		String produto, resposta;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o produto");
		produto = sc.next();
		
		System.out.println("Digite o Valor do Produto");
		valor = sc.nextDouble();
		
		do{
		System.out.println("Voce vai Pagar há Vista ou há Praso? (coloque so Vista ou Praso)");
		resposta = sc.next();
		
		if (resposta.equals("Vista")) {
			valor -= valor * 0.045;
			
		} else if(resposta.equals("Prazo")) {
			valor = valor * 0.07;
			
		} else{
			resposta = "";
		}
		
		}while(resposta.equals(""));
		
		System.out.println("Parabens Voce Acaba de adiquirir um(a)" + produto + " por " + valor);
		
		

	}

}
