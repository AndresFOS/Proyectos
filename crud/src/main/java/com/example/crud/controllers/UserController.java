
package com.example.crud.controllers;

import com.example.crud.models.UserModel;
import com.example.crud.services.UserService;
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
@RequestMapping("/user")
public class UserController {
    
    //Establezco una conexión con los servicios para ejecutarlos
    @Autowired
    private UserService userService;
    
    //Petición Get
    @GetMapping
    private ArrayList<UserModel> getUsers(){
        //Este método va a retornar de este userService los datos con el método getUsers() que creé en UserService
        return this.userService.getUsers();
    }
    
    //Método Post
    //La anotación @RequestBody es para indicar que el usuario los vamos a insertar en el body mediante postman
    @PostMapping
    private UserModel getUser(@RequestBody UserModel user){
        return this.userService.saveUser(user);
    }
    
    //Para ejecutar este método toca insertar el id en la ruta(link)
    //La anotación @PathVariable("id") indica que el id será insertado en la ruta y porque el id es una variable
    @GetMapping(path = "/{id}")
    private Optional<UserModel> getUserById(@PathVariable("id") Long id){
        return this.userService.getUserById(id);
    }
    
    //Método Put
    //En este método toca especificar que se recibirán los datos por el body y también que el id va a tener
    //una ruta para activar el borrar
    @PutMapping(path = "/{id}")
    private UserModel updateUserById(@RequestBody UserModel request, @PathVariable Long id){
        return this.userService.updateUserById(request, id);
    }
    
    //Petición Delete
    @DeleteMapping(path = "/{id}")
    private String deleteUserById(@PathVariable("id") Long id){
        Boolean ok = this.userService.deleteUserById(id);
        
        if(ok){
            return "User con id " + id + " eliminado";
        } else {
            return "Error, no se pudo eliminar el usuario con id " + id;
        }
    }
    
}
