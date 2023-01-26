package operações;

import java.util.Scanner;

public class Ex28 {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
		
		int v1, v2, v3;
		
		System.out.printf("Digite o primeiro valor: ");
		v1 = ler.nextInt();
		
		System.out.printf("Digite o segundo valor: ");
		v2 = ler.nextInt();
		
		System.out.printf("Digite o terceiro valor: ");
		v3 = ler.nextInt();

		if ((v1 < v2) && (v1 < v3)) {
			if (v2 < v3)
				System.out.printf("1- %d \n2- %d \n3- %d", v1, v2, v3);
			else
				System.out.printf("1- %d \n2- %d \n3- %d", v1, v3, v2);
	   }else if ((v2 < v1) && (v2 < v3)) {
		   if (v1 < v3) 
			    System.out.printf("1- %d \n2- %d \n3- %d", v2, v1, v3); 
		   else 
			    System.out.printf("1- %d \n2- %d \n3- %d", v2, v3, v1);
           }else {
        	   if (v1 < v2) {
                System.out.printf("1- %d \n2- %d \n3- %d", v3, v1, v2);   
        	   }else {
        	    System.out.printf("1- %d \n2- %d \n3- %d", v3, v2, v1);
        	   }
           }
		   
	   }

	}
