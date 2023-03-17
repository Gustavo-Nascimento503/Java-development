package service;

import java.util.Scanner;
import java.io.IOException;
import java.util.HashMap;
import org.apache.http.HttpEntity;
import org.apache.http.ParseException;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.json.*;
import model.Comentarios;
import model.Filmes;



public class apiFilme {

	Integer idComen = 0;
	Scanner ler = new Scanner(System.in);
	
	public HashMap<Integer, Filmes> getFilmes() throws JSONException, ParseException, IOException {
		HashMap<Integer, Filmes> filme = new HashMap<Integer, Filmes>();

		HttpGet request = new HttpGet("https://sujeitoprogramador.com/r-api/?api=filmes");

		try (CloseableHttpClient httpClient = HttpClientBuilder.create().disableRedirectHandling().build();

				CloseableHttpResponse response = httpClient.execute(request)) {

			HttpEntity entity = response.getEntity();

			if (entity != null) {

				String result = EntityUtils.toString(entity);

				JSONArray payload = new JSONArray(result);

				for (int i = 0; i < payload.length(); ++i) {

					Filmes movies = new Filmes();

					JSONObject dataNome = payload.getJSONObject(i);
					movies.setId(dataNome.getInt("id"));
					movies.setNome(dataNome.getString("nome"));
					movies.setSinopse(dataNome.getString("sinopse"));

					filme.put(movies.getId(), movies);
				}

			}
		}

		return filme;

	}
	
	public String printFilmes(HashMap<Integer, Filmes> filme) {
		
		String listaFilmes = "Lista dos Filmes em Cartaz: \n";
		
		for(Integer id: filme.keySet()) {
			listaFilmes += ("\nID: "+id+"  \n  "+filme.get(id).getNome());
		}
		
		return(listaFilmes);
	}
	
	public String getOpcao(HashMap<Integer, Filmes> filme){	
		
		System.out.print("\nEscolha uma opção:\r\n"
				+ "\r\n"
				+ "1 - Ver detalhes do filme\r\n"
				+ "2 - Fazer um comentário do filme\r\n"
				+ "3 - Excluir um comentário\r\n"
				+ "");
		int opc = ler.nextInt();
		int id;
		
		if(opc == 1) {
			
			String detalhes;
			
			System.out.print("Digite o id do filme: ");
			id = Integer.valueOf(ler.nextInt());
			
			detalhes = "\nSinopse: "+filme.get(id).getSinopse();
			
			if(filme.get(id).getComentario() != null) {
				detalhes = "";
				for(Integer idComentario: filme.get(id).getComentario().keySet()) {
					detalhes += "\nID Comentário: "+filme.get(id).getComentario().get(idComentario).getId()+" \nNome: "+filme.get(id).getComentario().get(idComentario).getNome()+" \nComentário: "+filme.get(id).getComentario().get(idComentario).getComentario();
				}
			}
			else
				detalhes += "\nEsse filme ainda não possui comentários.";
				
			return detalhes;
		}
		else if(opc == 2) {
			
			HashMap<Integer, Comentarios> com = new HashMap<Integer, Comentarios>();
			
			Comentarios comenta = new Comentarios();
			
			System.out.print("Digite o id do filme: ");
			id = Integer.valueOf(ler.nextInt());
			
			System.out.print("Digite o seu Nome: ");
			comenta.setNome(ler.next());
			
			System.out.print("Digite o seu Comentário: ");
			comenta.setComentario(ler.next());
			
			comenta.setId(idComen+Integer.valueOf(1));
			com.put(comenta.getId(), comenta);
			
			filme.get(id).setComentario(com);
			return "Comentário adicionado com sucesso!";
			
		}
		else if(opc == 3) {
			
			String detalhes = null;
			
			System.out.print("Digite o id do filme: ");
			id = Integer.valueOf(ler.nextInt());
			
			if(filme.get(id).getComentario() != null) {
				detalhes = "Comentários:";
				for(Integer idComentario: filme.get(id).getComentario().keySet()) {
					detalhes += "\nID Comentário: "+filme.get(id).getComentario().get(idComentario).getId()+" \nNome: "+filme.get(id).getComentario().get(idComentario).getNome()+" \nComentário: "+filme.get(id).getComentario().get(idComentario).getComentario();
				}
				System.out.print(detalhes);
				System.out.print("\nDigite o id do Comentário que deseja excluir: ");
				
				Integer idCom = Integer.valueOf(ler.nextInt());
				filme.get(id).getComentario().remove(idCom);
				
				return "Comentário excluido com sucesso!";
			}
			else {
				detalhes += "\nEsse filme ainda não possui comentários, se quiser realizar um comentario selecione a opção 2.";
				return detalhes;
			}
		}
		else 
			return "";	
		
	}
	
}
