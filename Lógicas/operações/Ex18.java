package operações;

import java.util.Scanner;

public class Ex18 {

	public static void main(String[] args) {
	Scanner ler = new Scanner(System.in);
		
		double a, v0, t, v;
		
		System.out.printf("Digite o valor da aceleração (em m/s2): ");
		a = ler.nextDouble();
		
		System.out.printf("Digite o valor da velocidade inicial (em m/s): ");
		v0 = ler.nextDouble();
		
		System.out.printf("Digite o valor do tempo de percurso (t em s): ");
		t = ler.nextDouble();

		v = v0 + (a * t);
		
		if (v <= 40) {
			System.out.printf("Veículo muito lento. A velocidade é: %.2f", v);
		}else if (v <= 60) {
			System.out.printf("Velocidade permitida. A velocidade é: %.2f", v);
		}else if (v <= 80) {
			System.out.printf("Velocidade de cruzeiro. A velocidade é: %.2f", v);
		}else if (v <= 120) {
			System.out.printf("Veículo rápido. A velocidade é: %.2f", v);
		}else {
			System.out.printf("Veículo muito rápido. A velocidade é: %.2f", v);
		}

	}

}
