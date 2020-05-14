package atividades;

public class ex01 {
	public static void main (String [] args) {
		

		int total = 0;
		
		for (int i = 0; i < 500; i+=3) {							
			if (i % 2 == 0 ) {
				
			}
			else {
				System.out.println(i);
				total += i;				
			}			
		}		
		System.out.println("o valor total dos numeros impares somados é de: " + total);
	}
}
