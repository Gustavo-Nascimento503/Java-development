package operações;

import java.util.*;

public class Ex48W {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, total, i;
		
		System.out.printf("digite o primeiro valor: ");
		n = ler.nextInt();
		
		total = n + 20;
		
		while(n < 0) {
			System.out.printf("digite o primeiro valor: ");
			n = ler.nextInt();
		}
		
		
		i = n;
		
		while(n < total) {
			n = i + 1;
			System.out.println(n);
			
			i++;
		}
			
		}

	}



