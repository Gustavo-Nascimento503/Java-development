package operações;

import java.util.*;

public class Ex44DW {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int i =1, soma = 0, maior = 0, n, media;
		
		
		do {
			System.out.println("Digite os numeros: ");
			n = ler.nextInt();
		}while(i <= 10);

		
		do {
			System.out.println("O número deve ser positivo!");
			System.out.println("Digite novamente: ");
			n = ler.nextInt();
		
		if (i == 1) {
			maior = n;
		} else if (n > maior) {
			maior = n;
		}

		soma = soma + n;
		i++;
		}while (n < 0);
		
		media = soma / 10;

		System.out.printf("O maior número é: %d", maior);
		System.out.printf("A soma dos valores é: %d", soma);
		System.out.printf("A média dos valores é: %d", media);
		

	}

}
