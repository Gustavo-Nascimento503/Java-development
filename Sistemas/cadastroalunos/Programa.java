package cadastroalunos;
 
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
 
public class Programa {
 
    public static void main(String[] args) throws IOException{
        Scanner ler = new Scanner(System.in);
       
        ArrayList<Aluno> listaAlunos = new ArrayList<>();
       
        int opcao;
        int id;
        String nome;
        String ra;
 
        do {        
            System.out.printf("===> Sistema de Cadastro de Alunos <===\n\n");
            System.out.printf("Escolha uma opção:\n");
            
            System.out.printf("1 - Incluir aluno \n" +
                    "2 - Atualizar aluno \n" +
                    "3 - Excluir aluno \n" +
                    "4 - Exibir alunos \n" +
                    "5 - Sair\n\n");
  System.out.printf("Digite a opção desejada: ");
  opcao = ler.nextInt();
 
  if (opcao == 1) {
      Aluno aluno = new Aluno();
     
      id = listaAlunos.size() + 1;
      aluno.setId(id);
     
      System.out.printf("\nDigite o nome do aluno: ");
      nome = ler.next();
      aluno.setNome(nome);
     
      System.out.printf("Digite o ra do aluno: ");
      ra = ler.next();
      aluno.setRa(ra);
     
      listaAlunos.add(aluno);
     
      System.out.printf("Aluno incluído com sucesso!");
      System.in.read();
  }
  else if (opcao == 2) {          
      for(Aluno a: listaAlunos) {
          System.out.printf("ID: %d - Nome: %s - RA: %s \n", a.getId(), a.getNome(), a.getRa());
      }
     
      System.out.printf("\nDigite o id do aluno que deseja atualizar: ");
      id = ler.nextInt();
     
      System.out.printf("Digite o novo nome do aluno: ");
      nome = ler.next();
     
      System.out.printf("Digite o novo ra do aluno: ");
      ra = ler.next();
      
      
      Aluno aluno = listaAlunos.get(id-1);
      
      aluno.setNome(nome);
      aluno.setRa(ra);
     
      System.out.printf("Aluno atualizado com sucesso!");
      System.in.read();
  }
  else if (opcao == 3) {
      for(Aluno a: listaAlunos) {
          System.out.printf("ID: %d - Nome: %s - RA: %s \n", a.getId(), a.getNome(), a.getRa());
      }
     
      System.out.printf("\nDigite o id do aluno para exclusão: ");
      id = ler.nextInt();

      listaAlunos.remove(id-1);
     
      System.out.printf("Aluno excluído com sucesso!");
      System.in.read();
  }
  else if (opcao == 4) {
      for(Aluno a: listaAlunos) {
          System.out.printf("ID: %d - Nome: %s - RA: %s \n", a.getId(), a.getNome(), a.getRa());
      }
     
      System.in.read();
  }
}while(opcao != 5);


}
}
