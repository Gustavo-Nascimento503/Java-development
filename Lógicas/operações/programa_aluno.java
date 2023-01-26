package operações;

import java.util.Scanner;

public class programa_aluno {
	
	
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		aluno[] listaAlunos = new aluno[5];
		
		for(int i = 0; i <= 4; i++) {
			aluno a = new aluno();
			
			System.out.print("Digite o seu RA: ");
			a.ra = ler.next();
			
			System.out.print("Digite o seu nome: ");
			a.nome = ler.next();
			
			System.out.print("Digite o seu periodo: ");
			a.periodo = ler.next();
			
			String[] mat = new String[6];
			System.out.print("Digite sua diciplina: ");
			for(int j=0; j<=5; i++) {
				System.out.print("Digite a sigla da diciplina: ");
				mat[j] = ler.next();
			}
			
			a.materias = mat;
			
			listaAlunos[i] = a;
		}
		
		for(int i =0; i<=4; i++) {
			if(listaAlunos[i].periodo.equals ("noite")) {
				System.out.println("RA: " + listaAlunos[i].ra);
				System.out.println("Nome: " + listaAlunos[i].nome);
				System.out.println("Periodo: " + listaAlunos[i].periodo);
				System.out.println("Materias:");
				for(int j=0; j<=4; j++) {
					System.out.println(listaAlunos[i].materias[j]);
				}
			}
		}
		
		
	}
}
