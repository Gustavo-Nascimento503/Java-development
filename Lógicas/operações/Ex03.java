package operações;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int b, h, resultado;
		
		System.out.printf("digite o valor da base: ");
		b = ler.nextInt();
		
		System.out.printf("digite o valor da altura: ");
		h = ler.nextInt();
		
		resultado = b * h;
		
		System.out.printf("o resultado e: %d", resultado / 2);
		

	}

}
