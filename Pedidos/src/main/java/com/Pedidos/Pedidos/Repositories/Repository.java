package com.Pedidos.Pedidos.Repositories;

import com.Pedidos.Pedidos.Entity.Pedido;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<Pedido, Long> {
}