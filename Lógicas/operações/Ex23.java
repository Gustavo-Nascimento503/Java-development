package operações;

import java.util.Scanner;

public class Ex23 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int v1, v2, v3, soma;
		
		
		System.out.printf("digite o valor de v1: ");
		v1 = ler.nextInt();
		System.out.printf("digite o valor de v2: ");
		v2 = ler.nextInt();
		System.out.printf("digite o valor de v3: ");
		v3 = ler.nextInt();
		soma = v1+ v2;
		
		
		if (soma < v3) {
			System.out.printf("nao e menor %d", soma);
		}
		else {
			System.out.printf("menor %d", v3);
		}
	}

}
