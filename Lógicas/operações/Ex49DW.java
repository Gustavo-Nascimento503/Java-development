package operações;

import java.util.*;

public class Ex49DW {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int inicial, fim, s, i, t;
		
		System.out.printf("digite o primeiro valor: ");
		inicial = ler.nextInt();
		
		System.out.printf("digite o final valor: ");
		fim = ler.nextInt();
		
		s = 0;
		i = 1;
		
		do {
			s = s + inicial;
			inicial ++;
			
			
		}while(inicial <= fim);
		System.out.print(s);

			
		}

	}





