package operações;

import java.util.Scanner;

public class Ex31W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int v;
		
		System.out.printf("digite o valor:");
		v = ler.nextInt();
		
		while(v < 0) {
			System.out.println("valor invalido digite outro");
			System.out.printf("digite o valor:");
			v = ler.nextInt();
		}
		System.out.printf("valor correto");

	}

}
