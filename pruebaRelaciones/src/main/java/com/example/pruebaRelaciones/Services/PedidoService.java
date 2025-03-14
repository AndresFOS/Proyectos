
package com.example.pruebaRelaciones.Services;

import com.example.pruebaRelaciones.Models.ClienteModel;
import com.example.pruebaRelaciones.Models.PedidoModel;
import com.example.pruebaRelaciones.Repositories.IClienteRepository;
import com.example.pruebaRelaciones.Repositories.IPedidoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PedidoService {
    
    @Autowired
    private IPedidoRepository pedidoRepository;
    
    @Autowired
    private IClienteRepository clienteRepository;
    
    //Traer todos los pedidos
    public List<PedidoModel> traerPedidos(){
        
        return pedidoRepository.findAll();
    }
    
    //Traer pedidos por id
    public Optional<PedidoModel> traerPedidoPorId(Integer id){
        
        return pedidoRepository.findById(id);
    }
    
    //Crear pedido
    public PedidoModel crearPedido(PedidoModel pedido){
        //Validar si ya existe un cliente
        ClienteModel clienteExistente = clienteRepository.findById(pedido.getCliente().getId()).orElseThrow();
        
        //Asociar el pedido al cliente
        pedido.setCliente(clienteExistente);
        
        
        return pedidoRepository.save(pedido);
    }
    
    //Editar pedido
    public PedidoModel actualizarPedido(PedidoModel pedido, Integer id){
        //Buscar el pedido existente
        PedidoModel pedidoExistente = pedidoRepository.findById(id).orElseThrow();
        
        pedidoExistente.setPedido(pedido.getPedido());
        pedidoExistente.setCantidad(pedido.getCantidad());
        
        //Buscar que exista un cliente enlazado a los pedidos
        if(pedido.getCliente() != null && pedido.getCliente().getId() != null){
            
            //Buscar el id del cliente
            ClienteModel clienteExistente = clienteRepository.findById(pedido.getCliente().getId()).orElseThrow();
            
            pedidoExistente.setCliente(clienteExistente);
        }
        
        return pedidoRepository.save(pedidoExistente);
    }
    
    //Eliminar pedido
    public Boolean eliminarPedido(Integer id){
        
        try {
            pedidoRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
    
}
