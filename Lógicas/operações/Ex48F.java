package operações;

import java.util.*;

public class Ex48F {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int n, total, i;
		
		System.out.printf("digite o primeiro valor: ");
		n = ler.nextInt();
		
		total = n + 20;
		
		for(i = n; i < total; i++) {
			n = i + i;
					
			System.out.println(n);		
			
			
		}

	}

}
