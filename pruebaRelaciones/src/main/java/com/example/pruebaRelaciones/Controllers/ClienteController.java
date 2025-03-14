
package com.example.pruebaRelaciones.Controllers;

import com.example.pruebaRelaciones.Models.ClienteModel;
import com.example.pruebaRelaciones.Services.ClienteService;
import java.util.List;
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
@RequestMapping("/clientes")
public class ClienteController {
    
    @Autowired
    private ClienteService clienteService;
    
    @GetMapping
    public List<ClienteModel> traerClientes(){
        
        return this.clienteService.traerClientes();
    }
    
    @GetMapping("/{id}")
    public Optional<ClienteModel> traerClientePorId(@PathVariable("") Integer id){
        
        return this.clienteService.traerClientePorId(id);
    }
    
    @PostMapping
    public ClienteModel crearCliente(@RequestBody ClienteModel cliente){
        
        return this.clienteService.crearClientes(cliente);
    }
    
    @PutMapping("/{id}")
    public ClienteModel actualizarCliente(@RequestBody ClienteModel cliente, @PathVariable Integer id){
        
        return this.clienteService.actualizarCliente(cliente, id);
    }
    
    @DeleteMapping("/{id}")
    public String eliminarCliente(@PathVariable("") Integer id){
        
        //Elimino el cliente con sus pedidos
        boolean ok = this.clienteService.eliminarCliente(id);
        
        if(ok){
            return "Cliente eliminado éxitosamente " + id;
        } else {
            return "No se pudo eliminar el cliente " + id; 
        }
    }
    
}
