package operações;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double produto, produto_desconto;
		String forma_pgto;
		
		System.out.printf("digite o valor do produto: ");
		produto = ler.nextDouble();
		
		System.out.printf("1- Dinheiro ou cheque, 2- cartão, 3- em duas vezes, 4- em 4 vezes: ");
		forma_pgto = ler.next();
		
		if (forma_pgto.equals("1")) {
			produto_desconto = produto -(0.10 * produto);
			System.out.printf("com desconto fica %f: ", produto_desconto);
			
		}else if (forma_pgto.equals("2")) {
			produto_desconto = produto -(0.15 * produto);
			System.out.printf("com desconto fica %f: ", produto_desconto);
			
		}else if (forma_pgto.equals("3")) {
			System.out.printf("2 vezes em preço normal %f: ", produto / 2);
		}else{
			System.out.printf("em 4 vezes em preço normal com juros de %f", produto / 4 * 0.10);
		}	
			
	}

}
