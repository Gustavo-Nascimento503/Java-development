package operações;

import java.util.Scanner;

public class Ex42F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n = 0, numerador=1, denominador=2, soma=0, i, divisor;
		
		System.out.printf("digite o valor: ");
		n = ler.nextInt();
		
		while(n <= 0 || n > 50) {
			System.out.printf("o valor deve ser positivo e menor que 50: ");
			n = ler.nextInt();
		}
		
		for(i=0; i <= n; i++) {
			divisor = numerador / denominador;
			soma = soma + divisor;
			System.out.printf("%d. %d / %d ", i, numerador, denominador);
			numerador = numerador + 1;
			denominador = denominador + 1;
		}
		
		System.out.printf("a soma é: %d", soma);

	}

}
