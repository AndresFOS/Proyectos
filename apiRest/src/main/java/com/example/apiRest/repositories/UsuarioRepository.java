
package com.example.apiRest.repositories;

import com.example.apiRest.models.UsuarioModel;
import java.util.ArrayList;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UsuarioRepository extends CrudRepository<UsuarioModel, Long> {
    
    public abstract ArrayList<UsuarioModel> findByPrioridad(Integer prioridad);
    
}
