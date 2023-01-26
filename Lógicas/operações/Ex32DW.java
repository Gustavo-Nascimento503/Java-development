package operações;

import java.util.Scanner;

public class Ex32DW {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int v1, v2;
		
		System.out.printf("digite o valor:");
		v1 = ler.nextInt();
		
		System.out.printf("digite o segundo valor, sendo maior que o primeiro:");
		v2 = ler.nextInt();
		
		do {
			System.out.printf("digite o segundo valor, sendo maior que o primeiro:");
			v2 = ler.nextInt();
		}while(v2 < v1);
		
		
		System.out.printf("valor correto");
		

	}

}