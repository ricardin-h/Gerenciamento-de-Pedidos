package com.Pedidos.Pedidos.Controllers;

import com.Pedidos.Pedidos.Entity.Pedido;
import com.Pedidos.Pedidos.Service.PedidoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.Provider;
import java.util.List;

@RestController
@RequestMapping("/pedidos")
public class PedidoController {

    @Autowired
    private PedidoService pedidoService;

    @PostMapping
    public Pedido criarPedido(@RequestBody Pedido pedido){
        return pedidoService.criarPedido(pedido);
    }

    @GetMapping
    public List<Pedido> listar(){
        return pedidoService.listar();
    }

    @GetMapping("/{id}")
    public Pedido buscarPorId(@PathVariable Long id){
        return pedidoService.buscarPorId(id);
    }

    @DeleteMapping("/{id}")
    public void deletarPedido(@PathVariable Long id){
        pedidoService.deletarPedido(id);
    }

}
