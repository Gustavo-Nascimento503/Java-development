package operações;

import java.util.*;

public class Ex45W {
		Scanner ler = new Scanner(System.in);
		
		int soma = 0, n, i =1, maior = 0, menor = 0, media;{
			
		while(i <= 5) {
			System.out.println("Digite o numero:  ");
			n = ler.nextInt();

			while (n < 0) {
				System.out.println("O número deve ser positivo!");
				System.out.printf("Digite novamente: ");
				n = ler.nextInt();
			}
			if (i == 1) {
				maior = n;
				i = i +1;
			} else if (n > maior) {
				maior = n;
				i = i +1;
			}
			
			if(i == 1) {
				menor = n;
				i = i +1;
				
			} else if(n < menor) {
				menor = n;
				i = i +1;
			}

			soma = soma + n;
			
		}

		media = soma / 10; 
		
		System.out.printf("O menor número é: %d", menor);
		System.out.printf("O maior número é: %d", maior);
		System.out.printf("A soma dos valores é: %d", soma);
		System.out.printf("A média dos valores é: %d", media);
		
		}
}
