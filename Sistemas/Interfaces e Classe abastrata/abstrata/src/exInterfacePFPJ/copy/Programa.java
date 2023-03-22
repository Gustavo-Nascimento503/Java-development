package exInterfacePFPJ.copy;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


public class Programa {


    public static void main(String[] args) throws IOException {
       
        Scanner ler = new Scanner(System.in);
           
        ArrayList<Pessoa> listaPessoa = new ArrayList<>();
       
        int opcao;
        int id_pessoa = 0;
       
        do {        
            System.out.printf("===> Sistemas de operações <===\n\n");
            System.out.printf("Escolha uma opção:\n");          
            System.out.printf("1 - Cadastrar pessoa física \n" +
                              "2 - Cadastrar pessoa jurídica \n" +
                              "3 - Exibir pessoas \n" +
                              "4 - Sair\n\n");
 
            System.out.printf("Digite a opção desejada: ");
            opcao = ler.nextInt();
           
            if (opcao == 1) {
                PessoaFisica pessoaFisica = new PessoaFisica();
               
                if(listaPessoa.size() > 0) {
                    id_pessoa = listaPessoa.get(listaPessoa.size()-1).getId() + 1;
                }
                else {
                    id_pessoa = 1;
                }
                pessoaFisica.setId(id_pessoa);
               
                System.out.println("Digite o nome: ");                
                pessoaFisica.setNome(ler.next());
               
                System.out.println("Digite o email: ");                
                pessoaFisica.setEmail(ler.next());
               
                System.out.println("Digite o CPF: ");                
                pessoaFisica.setCPF(ler.next());
               
                listaPessoa.add(pessoaFisica);


                System.out.printf("Pessoa física cadastrada com sucesso!");
                System.in.read();
            }
            else if (opcao == 2) {
                PessoaJuridica pessoaJuridica = new PessoaJuridica();
               
                if(listaPessoa.size() > 0) {
                    id_pessoa = listaPessoa.get(listaPessoa.size()-1).getId() + 1;
                }
                else {
                    id_pessoa = 1;
                }
                pessoaJuridica.setId(id_pessoa);
               
                System.out.println("Digite o nome: ");                
                pessoaJuridica.setNome(ler.next());
               
                System.out.println("Digite o email: ");                
                pessoaJuridica.setEmail(ler.next());
               
                System.out.println("Digite o CNPJ: ");                
                pessoaJuridica.setCNPJ(ler.next());
               
                listaPessoa.add(pessoaJuridica);


                System.out.printf("Pessoa jurídica cadastrada com sucesso!");
                System.in.read();
            }
            else if (opcao == 3) {
                for (Pessoa p: listaPessoa) {
                    if (p instanceof PessoaFisica)
                        System.out.println("Pessoa Física:");
                    else
                        System.out.println("Pessoa Jurídica:");
                   
                    System.out.println("    Id: " + p.getId());
                    System.out.println("  Nome: " + p.getNome());
                    System.out.println("E-mail: " + p.getEmail());
                    
                    
                   
                    if (p instanceof PessoaFisica) {
                        PessoaFisica pf = (PessoaFisica) p;
                        System.out.println("   CPF: " + pf.getCPF());
                    }
                    else {
                       PessoaJuridica pj = (PessoaJuridica) p;
                        System.out.println("  CNPJ: " + pj.getCNPJ());
                    }
                }
            }
        } while ( (opcao >= 1) && (opcao <= 4) );
    }
}

