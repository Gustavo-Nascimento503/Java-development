package operações;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		Scanner  ler = new Scanner(System.in);
		
		int valor;
		
		System.out.printf("digite um numero: ");
		valor = ler.nextInt();
		
		if (valor == 0) {
			System.out.printf("seu valor é: %d", valor % 2 + 5);
		}else {
			System.out.printf("seu valor é: %d", valor + 8);
		}

	}

}
