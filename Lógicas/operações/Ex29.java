package operações;

import java.util.Scanner;

public class Ex29 {

	public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
		
		int n1, n2, n3;
		
		System.out.printf("Digite o primeiro valor: ");
		n1 = ler.nextInt();
		
		System.out.printf("Digite o segundo valor: ");
		n2 = ler.nextInt();
		
		System.out.printf("Digite o terceiro valor: ");
		n3 = ler.nextInt();

		if ((n1 > n2) && (n1 > n3)) {
			if (n2 > n3)
				System.out.printf("1- %d \n2- %d \n3- %d", n1, n2, n3);
			else
				System.out.printf("1- %d \n2- %d \n3- %d", n1, n3, n2);
	   }else if ((n2 > n1) && (n2 > n3)) {
		   if (n1 < n3) 
			    System.out.printf("1- %d \n2- %d \n3- %d", n2, n1, n3); 
		   else 
			    System.out.printf("1- %d \n2- %d \n3- %d", n2, n3, n1);
           }else {
        	   if (n1 > n2) {
                System.out.printf("1- %d \n2- %d \n3- %d", n3, n1, n2);   
        	   }else {
        	    System.out.printf("1- %d \n2- %d \n3- %d", n3, n2, n1);
        	   }
           }
		   
	   }

	}
