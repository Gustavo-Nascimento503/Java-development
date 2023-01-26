package operações;

import java.util.Scanner;

public class Ex34DW {
		Scanner ler = new Scanner(System.in);
		
		int num = 5;
		int i = 5;
		int r;{
		
		do {
			r = num * i;
			System.out.printf("\n%d X %d = %d", num, i, r);
			i = i + 1;
		}while (i < 11);
		
		}
}
