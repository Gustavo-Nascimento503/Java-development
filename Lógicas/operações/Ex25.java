package operações;

import java.util.Scanner;

public class Ex25 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int v1;
		int formula;
		
		
		System.out.printf("Digite o primeiro valor: ");
		v1 = ler.nextInt();
		formula = v1 % 2;
		
		if (formula == 1){
			System.out.printf("este numero é par");
		}else {
			System.out.printf("este numero é impar");
		}
	}

}
