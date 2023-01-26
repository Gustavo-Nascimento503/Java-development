package operações;

import java.util.Scanner;
public class Ex01 {

	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);
		
		int a, b, resultado;
		
		System.out.printf("digite o valor da area");
		a = leitura.nextInt();
		
		System.out.printf("digite o valor da base");
		b = leitura.nextInt();
		
		resultado = a * b;
		
		System.out.printf("a area e: %d", resultado);
		
		
	}

}
//scannner leia o teclado, %d e uma variavel numerica
