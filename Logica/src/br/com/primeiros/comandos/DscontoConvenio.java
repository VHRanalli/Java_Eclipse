package br.com.primeiros.comandos;

import java.util.Scanner;

public class DscontoConvenio {

	public static void main(String[] args) {
		
		double salario, resultado;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite o Seu Salario: ");
		salario = sc.nextDouble();
		
		if(salario >= 1000){
			resultado = salario * 0.05;
		}else{
			resultado = 0;
		}
		
		System.out.println("O Desconto do Salário é de : " + resultado);
		

	}

}
