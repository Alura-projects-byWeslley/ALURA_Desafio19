package br.com.gattigit.alura_gerenciar_pedidos.principal;

import br.com.gattigit.alura_gerenciar_pedidos.models.Categoria;
import br.com.gattigit.alura_gerenciar_pedidos.models.Pedido;
import br.com.gattigit.alura_gerenciar_pedidos.models.Produto;
import br.com.gattigit.alura_gerenciar_pedidos.repositorys.CategoriaRepository;
import br.com.gattigit.alura_gerenciar_pedidos.repositorys.PedidoRepository;
import br.com.gattigit.alura_gerenciar_pedidos.repositorys.ProdutoRepository;

import java.time.LocalDate;

public class Principal {
    public void teste(ProdutoRepository produtoRepository
            , CategoriaRepository categoriaRepository
            , PedidoRepository pedidoRepository){

        Produto produto = new Produto("Fusca", 9000.0);
        Categoria categoria = new Categoria(1L,"Carros");
        Pedido pedido = new Pedido(1L, LocalDate.now());

        produtoRepository.save(produto);
        categoriaRepository.save(categoria);
        pedidoRepository.save(pedido);
    }
}
