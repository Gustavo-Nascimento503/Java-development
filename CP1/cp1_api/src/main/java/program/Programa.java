package program;

import java.io.IOException;
import java.util.HashMap;
import org.apache.http.ParseException;
import org.json.JSONException;
import model.Filmes;
import service.apiFilme;

public class Programa {

	public static void main(String[] args) throws ParseException, JSONException, IOException {
		
		apiFilme apiMovies = new apiFilme();
		HashMap<Integer, Filmes> filme = apiMovies.getFilmes();
		
		System.out.print(apiMovies.printFilmes(filme));
		while(true)
			System.out.print(apiMovies.getOpcao(filme));

	}

}
