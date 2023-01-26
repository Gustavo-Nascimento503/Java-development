package operações;
import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int v1, v2;
		
		System.out.printf("Digite o primeiro numero: ");
        v1 = ler.nextInt();
        
        System.out.printf("Digite o segundo numero: ");
        v2 = ler.nextInt();
        
        if (v1 < v2) {
        	System.out.printf("o valor 1 e menor");
        }
        else {
        	System.out.printf("o valor 2 e menor");
        }

	}

}
