package br.com.gattigit.alura_gerenciar_pedidos.repositorys;

import br.com.gattigit.alura_gerenciar_pedidos.models.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PedidoRepository extends JpaRepository<Pedido, Long> {
}
