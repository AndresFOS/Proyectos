
package com.example.primeraApi.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
//Creo un endpoint general para todos los demás endpoints de mi controladora
@RequestMapping("/apisaludos")
public class SaludoController {
    
    //Mapeo el get con la dirección(endpoint)
    @GetMapping("/hola")
    public String holaMundo(){
        return "Hola mundo! ";
    }
    
    //Este endpoint requiere un nombre y una edad para poder ser ejecutado
    @GetMapping("/holanombre/{nombre}/{edad}")
    public String holaMundoNombre(@PathVariable String nombre, 
                                  @PathVariable int edad){
        return "Hola mundo! " + nombre + " tu edad es: " + edad;
    }
    
}
