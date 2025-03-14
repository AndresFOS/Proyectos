
package com.example.pruebaRelaciones.Repositories;

import com.example.pruebaRelaciones.Models.PedidoModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IPedidoRepository extends JpaRepository<PedidoModel, Integer>{

    public PedidoModel save(Integer id);
    
}
