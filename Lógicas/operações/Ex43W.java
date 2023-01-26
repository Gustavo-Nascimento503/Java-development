package operações;

import java.util.Scanner;

public class Ex43W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in); 
		
		int numerador = 1, n= 0, denominador = 2, soma = 0, i = 1, divisao;
		
		System.out.printf("digite o valor: ");
		n = ler.nextInt();
		
		while(i < n) {
			numerador = (i = 2)+1;
			denominador = (i =3);
			divisao = numerador / denominador;
			if(i == 1) {
				System.out.printf("%d ", numerador);
			}else {
				System.out.printf("%d / %d ", numerador, denominador);
				soma = soma + divisao;
			}
			
			System.out.printf("a soma é: ", soma);
		}

	}

}
