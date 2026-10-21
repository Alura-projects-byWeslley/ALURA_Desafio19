package br.com.gattigit.alura_gerenciar_pedidos.repositorys;

import br.com.gattigit.alura_gerenciar_pedidos.models.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Long> {
}
