package br.com.alura.screenmatch;

import br.com.alura.screenmatch.principal.Principal;
import br.com.alura.screenmatch.services.ConsumoApi;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ScreenmatchApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(ScreenmatchApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
	var json = ConsumoApi.consumoApi("http://www.omdbapi.com/?t=matrix&apikey=e027d2e4");
		Principal principal = new Principal();
		principal.exibeMenu();
	}
}
