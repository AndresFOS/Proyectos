
package com.example.pruebaRelaciones.Services;

import com.example.pruebaRelaciones.Models.ClienteModel;
import com.example.pruebaRelaciones.Repositories.IClienteRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClienteService {
    
    @Autowired
    private IClienteRepository clienteRepository;
    
    //Traer todos los clientes
    public List<ClienteModel> traerClientes(){
        
        return clienteRepository.findAll();
    }
    
    //Traer clientes por id
    public Optional<ClienteModel> traerClientePorId(Integer id){
        
        return clienteRepository.findById(id);
    }
    
    //Crear cliente con pedido
    public ClienteModel crearClientes(ClienteModel cliente){
        
        return clienteRepository.save(cliente);
    }
    
    //Actualizar clientes
    public ClienteModel actualizarCliente(ClienteModel cliente, Integer id){
        //Busco el cliente y lo traigo
        ClienteModel buscarCliente = clienteRepository.findById(id).get();
        
        buscarCliente.setNombre(cliente.getNombre());
        buscarCliente.setTelefono(cliente.getTelefono());
        
        return clienteRepository.save(buscarCliente);
    }
    
    //Eliminar cliente
    public Boolean eliminarCliente(Integer id){
        
        try {
            clienteRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
        
    }
    
}
