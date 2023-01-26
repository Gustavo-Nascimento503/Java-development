package operações;

import java.util.Scanner;

public class Ex41F {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		int n, a, i;
		
		System.out.printf("digite o valor: ");
		n = ler.nextInt();
		
		while(n <0 || n>100) {
			System.out.printf("o valor deve ser positivo e menor que 100: ");
			n = ler.nextInt();
		}
		
		for (i=0; i<= n; i++) {
			if(i==0) {
				a=((i + 1)*(i+1))+1;
			}else {
				a=((i + 1)*(i+1))+1;
				System.out.printf("%d ", a);
			}
		}
		

	}

}
