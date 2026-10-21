package br.com.gattigit.alura_gerenciar_pedidos;

import br.com.gattigit.alura_gerenciar_pedidos.models.Categoria;
import br.com.gattigit.alura_gerenciar_pedidos.principal.Principal;
import br.com.gattigit.alura_gerenciar_pedidos.repositorys.CategoriaRepository;
import br.com.gattigit.alura_gerenciar_pedidos.repositorys.PedidoRepository;
import br.com.gattigit.alura_gerenciar_pedidos.repositorys.ProdutoRepository;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AluraGerenciarPedidosApplication implements CommandLineRunner {
	@Autowired
	private ProdutoRepository produtoRepository;

	@Autowired
	private CategoriaRepository categoriaRepository;

	@Autowired
	private PedidoRepository pedidoRepository;

	public static void main(String[] args) {

		Dotenv dotenv = Dotenv.configure()
				.ignoreIfMissing().load();

		dotenv.entries().forEach(entry ->
				System.setProperty(entry.getKey(), entry.getValue()));
		SpringApplication.run(AluraGerenciarPedidosApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		new Principal().teste(produtoRepository, categoriaRepository, pedidoRepository);
	}
}
/*
1 - feito
2 - feito
3 - feito
4 - feito
5 - feito
6 - feito
7 -
*/