package operações;

import java.util.Scanner;

public class Ex07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int p1, p2, p3, p4, p5, pagar, resultado;
		
		System.out.printf("digite o valor do primeiro produto: ");
		p1 = ler.nextInt();
		
		System.out.printf("digite o valor do segundo produto: ");
		p2 = ler.nextInt();
		
		System.out.printf("digite o valor do terceiro produto: ");
		p3 = ler.nextInt();
		
		System.out.printf("digite o valor do quarto produto: ");
		p4 = ler.nextInt();
		
		System.out.printf("digite o valor do quinto produto: ");
		p5 = ler.nextInt();
		
		System.out.printf("digite o valor a ser pago: ");
		pagar = ler.nextInt();
		
		resultado = pagar - p1 - p2 -p3 - p4 - p5;
		
		System.out.printf("o seu troco e %d", resultado);
		
				
		
	
	}

}
