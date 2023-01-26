package operações;

import java.util.Scanner;

public class Ex42DW {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n = 0, numerador = 1, denominador = 2,  i = 1, soma = 0, divisor;
		
		System.out.printf("digite o valor: ");
		n = ler.nextInt();
		
		do {
			System.out.printf("o valor deve ser positivo e menor que 50: ");
			n = ler.nextInt();
		}while(n <= 0 || n > 50);
		
		
		do {
			divisor = numerador / denominador;
			soma = soma + divisor;
			System.out.printf("%d.  %d / %d ", i, numerador, denominador);
			numerador = numerador + 1;
			denominador = denominador + 1;
			i = i + 1;
		}
		while(i < n);
		
		System.out.printf("a soma é: %d", soma);

	}

}
