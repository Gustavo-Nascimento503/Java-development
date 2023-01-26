package operações;

import java.util.Scanner;

public class Ex47W {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

		String calculo;
		int fatorial, n, n1;

		calculo = "S";

		while (calculo.toUpperCase().equals("S")) {
			fatorial = 1;

			System.out.println("Digite o número (positivo) que você quer calcular o fatorial: ");
			n = ler.nextInt();
			n1 = n;

			while (n < 0) {
				System.out.println("O valor deve ser positivo.");
				System.out.println("Digite o número (positivo) que você quer calcular o fatorial: ");
				n = ler.nextInt();
				n1 = n;
			}
			if (n == 0) {
				System.out.println("0! = 1");
				System.out.println("Deseja calcular novamente? (S ou N)");
				calculo = ler.next();

				while ((!calculo.toUpperCase().equals("S")) && (!calculo.toUpperCase().equals("N"))) {
					System.out.println("Favor responder com S para SIM ou N para NÃO");
					System.out.println("Deseja calcular novamente? (S ou N)");
					calculo = ler.next();
				}
			} else {
				while (n > 0) {
					fatorial = fatorial * n;
					n = n - 1;
				}
				System.out.println(n1 + "! = " + fatorial);

				System.out.println("Deseja calcular novamente? (S ou N)");
				calculo = ler.next();

				while ((!calculo.toUpperCase().equals("S")) && (!calculo.toUpperCase().equals("N"))) {
					System.out.println("Favor responder com S para SIM ou N para NÃO");
					System.out.println("Deseja calcular novamente? (S ou N)");
					calculo = ler.next();
				}
			}
		}
		System.out.println("Programa Encerrado.");

		ler.close();
	}

}