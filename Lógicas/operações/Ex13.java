package operações;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
        int v1=0, v2, v3;
        int maiorNum = v1;

        System.out.printf("Digite o primeiro valor: ");
        v1 = ler.nextInt();

        System.out.printf("Digite o segund0 valor: ");
        v2 = ler.nextInt();

        System.out.printf("Digite o terceiro valor: ");
        v3 = ler.nextInt();

        if (v2 > v1 && v2 > v3 ){
            maiorNum = v2;
            System.out.printf("%d", maiorNum);
        }
        
        else if(v3 > v1 && v3 > v2) {
        	maiorNum = v3;
        	System.out.printf("%d", maiorNum);
        }
        
        else{
        	System.out.printf("o terceiro numero é o maior: %d", maiorNum);
        }
}     	
	}

