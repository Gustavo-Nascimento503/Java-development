
package operações;

import java.util.Scanner;

public class Ex41DW {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, i, a;
		
		System.out.printf("digite o valor de n: ");
		n = ler.nextInt();
		
		
		do{
			System.out.printf("o valor deve ser positivo e menor que 100: ");
			n = ler.nextInt();
		}while(n <0 || n>100);
			
			
			i = 0;
			
			while(i <= n) {
				if(i == 0) {
					a = ((i + 1) * (i +1))+1;
					i = i + 1;
				}else {
					a = ((i + 1) * (i +1))+1;
					i = i + 1;
					System.out.printf("%d ", a);
				}
			}
		}
		
		
	}
