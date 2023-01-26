package operações;
import java.util.Scanner;

public class Ex10 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int v1, v2;
		
		System.out.printf("Digite o primeiro numero: ");
        v1 = ler.nextInt();
        
        System.out.printf("Digite o segundo numero: ");
        v2 = ler.nextInt();
        
        if (v1 > v2) {
        	System.out.printf("o ´primeiro valor e o maior");
        }else if(v2 > v1) {
        	System.out.printf("o segundo valor e o maior");
        }
        
        else {
        	System.out.printf("os valores sao iguais");
        }
        
        }
	}
