package operações;

import java.util.Scanner;

public class Ex19 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int p1=0, p2=0;
		int media = (p1 + (p2 * 2)) / 3;
		
		System.out.printf("digite o valor da p1: ");
		p1 = ler.nextInt();
		System.out.printf("digite o valor da p2: ");
		p2 = ler.nextInt();
		
		if(media > 5) {
			System.out.printf("Aprovado");
		}
		else {
			System.out.printf("Reprovado");
		}

	}

}
