package atividades;

import java.util.Scanner;

public class ex04 {
	public static void main(String[] args) {
		int aluno = 1;
		double notaA = 0;
		double notaB = 0;
		String nome = "";
		System.out.println("Calculo de media ponderada");
		Scanner scan = new Scanner(System.in);

		while (aluno <= 5) {
			System.out.println("------------------------------------------------");
			System.out.println("Aluno " + aluno + ", qual � o seu nome?");
			nome = scan.next();
			System.out.println(nome + ", Digite sua nota 1: ");
			notaA = scan.nextDouble();
			if (notaA >= 0 && notaA <= 10) {
				System.out.println(nome + ", digite sua nota 2: ");
				notaB = scan.nextDouble();
				if (notaB >= 0 && notaB <= 10) {
					double media = (notaA + notaB * 2) / 3;
					System.out.println(nome + ", sua m�dia final �: " + media);
					aluno++;
				} else {
					System.out.println(nome + ", digite uma nota v�lida!");
					System.out.println("Repetindo a opera��o.");
				}
			} else {
				System.out.println(nome + ", digite uma nota v�lida!");
				System.out.println("Repetindo a opera��o.");
			}
		}
		System.out.println("fim!");
	}
}
