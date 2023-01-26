package operações;

import java.util.Scanner;

public class Ex40F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int a, b, c, r;
		
		a = -1;
		b = 1;
		c = 1;
		r = a + b + c;
		
		for(int i=1; i<=20; i++) {
			System.out.println(r);
			c = b;
			b = a;
			a = r;
			r = a;
			r = a+b+c;
		}
	}
	}


