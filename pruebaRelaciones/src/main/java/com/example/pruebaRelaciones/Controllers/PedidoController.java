
package com.example.pruebaRelaciones.Controllers;

import com.example.pruebaRelaciones.Models.PedidoModel;
import com.example.pruebaRelaciones.Services.PedidoService;
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
@RequestMapping("/pedidos")
public class PedidoController {
    
    @Autowired
    private PedidoService pedidoService;
    
    //Traer todos los pedidos
    @GetMapping
    public List<PedidoModel> traerPedidos(){
        
        return this.pedidoService.traerPedidos();
    }
    
    //Traer pedidos por id
    @GetMapping("/{id}")
    public Optional<PedidoModel> traerPedidosPorId(@PathVariable("") Integer id){
        
        return this.pedidoService.traerPedidoPorId(id);
    }
    
    @PostMapping
    public PedidoModel crearPedido(@RequestBody PedidoModel pedido){
        
        return this.pedidoService.crearPedido(pedido);
    }
    
    @PutMapping("/{id}")
    public PedidoModel actualizarPedido(@RequestBody PedidoModel pedido, @PathVariable Integer id){
        
        return this.pedidoService.actualizarPedido(pedido, id);
    }
    
    @DeleteMapping("/{id}")
    public String eliminarPedido(@PathVariable("") Integer id){
        
        boolean ok = this.pedidoService.eliminarPedido(id);
        
        if(ok){
            return "Se eliminó el pedido correctamente " + id;
        } else {
            return "No se puedo eliminar el pedido " + id;
        }
    }
    
}
