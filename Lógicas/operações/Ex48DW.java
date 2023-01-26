package operações;

import java.util.*;

public class Ex48DW {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, total, i;
		
		
		do {
		System.out.printf("digite o primeiro valor: ");
		n = ler.nextInt(); 
		}while(n < 0);
		
		total = n + 20;
		

		
		
		i = n;
		
		do {
			n = i + 1;
			System.out.println(n);
			
			i++;
		}while(n < total);
			
		}

	}




