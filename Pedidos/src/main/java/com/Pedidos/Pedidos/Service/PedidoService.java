package com.Pedidos.Pedidos.Service;

import com.Pedidos.Pedidos.Entity.Pedido;
import org.springframework.beans.factory.annotation.Autowired;
import com.Pedidos.Pedidos.Repositories.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private Repository repository;

    public Pedido criarPedido(Pedido pedido){
        return repository.save(pedido);
    }

    public List<Pedido> listar(){
        return repository.findAll();
    }

    public Pedido buscarPorId(Long id){
        return repository.findById(id).get();
    }

    public void deletarPedido(Long id){
        repository.deleteById(id);
    }

}
