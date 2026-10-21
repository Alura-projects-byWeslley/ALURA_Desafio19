package br.com.gattigit.alura_gerenciar_pedidos.repositorys;

import br.com.gattigit.alura_gerenciar_pedidos.models.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
}
