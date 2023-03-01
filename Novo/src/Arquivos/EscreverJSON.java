package Arquivos;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonParser;

public class EscreverJSON {

	public static void main(String[] args) throws IOException {
		
		
		User usuario1 = new User();
		usuario1.setCpf("1516516515");
		usuario1.setLogin("teste1");
		usuario1.setNome("Um");
		usuario1.setSenha("121542");
		
		
		User usuario2 = new User();
		usuario2.setCpf("2454651561");
		usuario2.setLogin("teste2");
		usuario2.setNome("Dois");
		usuario2.setSenha("26515");
		
		
		User usuario3 = new User();
		usuario3.setCpf("3625414154");
		usuario3.setLogin("teste3");
		usuario3.setNome("Três");
		usuario3.setSenha("36515");
		
		List<User> usuario = new ArrayList<User>();
		
		usuario.add(usuario1);
		usuario.add(usuario2);
		usuario.add(usuario3);
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		String listasUser = gson.toJson(usuario);
		
		//String listasUser = new Gson().toJson(usuario);
		
		System.out.println(listasUser);
		
		
		
		FileWriter arquivo = new FileWriter("C:\\Users\\MarceloD\\git\\repository\\Novo\\src\\Arquivos\\teste.json");
		
		arquivo.write(listasUser);
		arquivo.flush();
		arquivo.close();
		
		//==========================================================
		
		
		FileReader lerJson = new FileReader("C:\\Users\\MarceloD\\git\\repository\\Novo\\src\\Arquivos\\teste.json");
		
		JsonArray jarray = (JsonArray) JsonParser.parseReader(lerJson);
		
		List<User> lusuario = new ArrayList<User>();
		
		for(JsonElement jsonElement: jarray) {
			
			User usuario4 = new Gson().fromJson(jsonElement, User.class);
			lusuario.add(usuario4);
		}
		
		System.out.println("Json " + lusuario);
		
		
	}

}
