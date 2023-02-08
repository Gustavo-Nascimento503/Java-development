package program;

import java.io.IOException;
import java.util.*;

import org.apache.http.client.ClientProtocolException;

import model.Endereco;
import service.ViaCepService;


public class Teste {

	public static void main(String[] args) throws ClientProtocolException, IOException {
		
		String digita;
		Scanner ler = new Scanner(System.in);
		
		ViaCepService viacepservice = new ViaCepService();
		
		try {
			System.out.println("Digite seu cep:");
			
			Endereco endereco = viacepservice.getEndereco(digita = ler.next());
	           
            String logradouro = endereco.getLogradouro();
            String uf = endereco.getUf();
           
            System.out.println(endereco + "\n");
            System.out.println(logradouro + "\n");
            System.out.println(uf  + "\n");

			
		} catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }  


		

		

	}

}
