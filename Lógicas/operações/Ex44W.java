package operações;

import java.util.*;

public class Ex44W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int i =1, soma = 0, maior = 0, n, media;
		
		while(i <= 10){
			System.out.println("Digite os numeros: ");
			n = ler.nextInt();

			while (n < 0) {
				System.out.println("O número deve ser positivo!");
				System.out.println("Digite novamente: ");
				n = ler.nextInt();
			}
			if (i == 1) {
				maior = n;
			} else if (n > maior) {
				maior = n;
			}

			soma = soma + n;
			i++;
		}
		media = soma / 10;

		System.out.printf("O maior número é: %d", maior);
		System.out.printf("A soma dos valores é: %d", soma);
		System.out.printf("A média dos valores é: %d", media);
		

	}

}
