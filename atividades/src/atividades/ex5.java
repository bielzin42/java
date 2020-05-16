package atividades;

import java.util.Scanner;

public class ex5 {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Digite os numeros sucessivamente para somar");
		System.out.println("Para sair digite um numero negativo.");
		double valor = 0;
		int contador = 0;
		double soma = 0;
		while (valor >= 0 || valor <= 0) {
			valor = in.nextDouble();
			if (valor >= 0) {
				soma += valor;
				System.out.println("A soma dos valores é: " + soma);
				contador++;
			} else {
				System.out.println("Numero negativo acionado, operação parada.");
				System.out.println("A soma dos valores é: " + soma + " e a média dos valores é: " + (soma / contador));
			}
		}
	}
}
