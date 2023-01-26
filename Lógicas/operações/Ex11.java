package operações;

import java.util.Scanner;

public class Ex11 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int b, h, area;
		
		System.out.printf("Digite o valor da base: ");
		b = ler.nextInt();
		
		System.out.printf("Digite o valor da altura: ");
		h = ler.nextInt();
		
		area = b * h;
		
		if (area > 100) {
			System.out.printf("Terreno %d grande", area);
		}
	}

}
