
package com.example.pruebaRelaciones.Repositories;

import com.example.pruebaRelaciones.Models.ClienteModel;
import org.springframework.data.jpa.repository.JpaRepository;


public interface IClienteRepository extends JpaRepository<ClienteModel, Integer>{
    
}