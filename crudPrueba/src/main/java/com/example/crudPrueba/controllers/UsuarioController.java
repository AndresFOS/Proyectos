
package com.example.crudPrueba.controllers;

import com.example.crudPrueba.models.UsuarioModel;
import com.example.crudPrueba.services.UsuarioService;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/usuario")
public class UsuarioController {
    
    @Autowired
    private UsuarioService usuarioService;
    
    @GetMapping
    public ArrayList<UsuarioModel> traerUsuarios(){
        
        return this.usuarioService.traerUsuarios();
    }
    
    @PostMapping
    public UsuarioModel crearUsuario(@RequestBody UsuarioModel usuario){
        
        return this.usuarioService.crearUsuario(usuario);
    }
    
    @GetMapping(path = "/{id}")
    public Optional<UsuarioModel> traerUsuarioPorId(@PathVariable("id") Long id){
        
        return this.usuarioService.traerUsuarioPorId(id);
    }
    
    @PutMapping(path = "/{id}")
    public UsuarioModel actualizarUsuario(@RequestBody UsuarioModel usuarioInsertado, @PathVariable Long id){
        
        return this.usuarioService.actualizarUsuario(usuarioInsertado, id);
    }
    
    @DeleteMapping(path = "/{id}")
    public String eliminarUsuario(@PathVariable("") Long id){
        
        Boolean ok = usuarioService.eliminarUsuario(id);
        
        if(ok){
            return "El usuario con id: " + id + " ha sido eliminado";
        } else {
            return "No se ha podido eliminar al usuario con id: " + id;
        }
    }
    
}
