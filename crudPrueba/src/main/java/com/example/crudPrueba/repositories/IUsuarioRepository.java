
package com.example.crudPrueba.repositories;

import com.example.crudPrueba.models.UsuarioModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUsuarioRepository extends JpaRepository<UsuarioModel, Long>{
    
    
    
}
