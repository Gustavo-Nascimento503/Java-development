package operações;

import java.util.Scanner;

public class Ex35W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int valor, i, r;
		
		System.out.printf("digite o valor: ");
		valor = ler.nextInt();
		
		while(valor < 0) {
			System.out.println("valor invalido digite um positivo: ");
			valor = ler.nextInt();
						
		} i = 1;
		while(i < 11 ) {
			r = valor * i;
			System.out.printf("\n%d * %d = %d", valor, i, r);
			i++;
		}
		
		

	}

}