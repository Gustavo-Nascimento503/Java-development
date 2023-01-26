package operações;
import java.util.Scanner;


public class Ex37F {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
	
		int v1, interval, r;
		
		System.out.printf("digite um valor positivo (obrigatorio): ");
		v1 = ler.nextInt();
		
		
		
		while(v1 <=0 || v1>20) {
			System.out.println("valor invalido, digite outro abaixo ");
			v1 = ler.nextInt();
		}
		
		for(interval = 1; interval<=10; interval++) {
			r = v1 * interval;
			System.out.printf("pressione enter: ");
			ler.nextLine();
			System.out.printf("%d X %d = %d ",v1, interval, r);
		}
	}

}
