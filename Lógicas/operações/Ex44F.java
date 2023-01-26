package operações;

import java.util.Scanner;

public class Ex44F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int i, soma, n, maior, media;

		soma = 0;
		maior = 0;

		for (i = 1; (i <= 10); i++) {
			System.out.println("Digite o numero:  ");
			n = ler.nextInt();

			while (n < 0) {
				System.out.println("O número deve ser positivo!");
				System.out.printf("Digite novamente: ");
				n = ler.nextInt();
			}
			if (i == 1) {
				maior = n;
			} else if (n > maior) {
				maior = n;
			}

			soma = soma + n;
			
		}
		media = soma / 10; 

		System.out.printf("O maior número é: %d", maior);
		System.out.printf("A soma dos valores é: %d", soma);
		System.out.printf("A média dos valores é: %d", media);

	}

}
