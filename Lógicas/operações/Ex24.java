package operações;

import java.util.Scanner;

public class Ex24 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		String nome, sexo, estado_civil;
		int anos;
		
		System.out.printf("digite seu nome: ");
		nome = ler.next();
		System.out.printf("digite seu sexo em m/f: ");
		sexo = ler.next();
		System.out.printf("digite seu estado civil: ");
		estado_civil = ler.next();
		
		if (sexo.equals("f") && estado_civil.equals("casada")) {
			System.out.printf("digite o ano de casada: ");
			anos = ler.nextInt();
			
		}else if (sexo.equals("m")) {
			System.out.printf("seu sexo nao é feminino");
			
		}else {
			System.out.printf("invalido");
		}
	}

}