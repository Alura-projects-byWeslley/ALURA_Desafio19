package br.com.gattigit.alura_gerenciar_pedidos;

import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AluraGerenciarPedidosApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(AluraGerenciarPedidosApplication.class, args);

		Dotenv dotenv = Dotenv.configure()
				.ignoreIfMissing().load();

		dotenv.entries().forEach(entry ->
				System.setProperty(entry.getKey(), entry.getValue()));
	}

	@Override
	public void run(String... args) throws Exception {

	}
}