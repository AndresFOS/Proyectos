
package com.example.practicaApiRest.Controllers;

import com.example.practicaApiRest.Models.UserModel;
import com.example.practicaApiRest.Services.UserService;
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
@RequestMapping("/users")
public class UserController {
    
    @Autowired
    private UserService userService;
    
    //Traer usuarios
    @GetMapping
    public List<UserModel> getUsers(){
        
        return this.userService.getUsers();
    }
    
    //Traer usuarios por id
    @GetMapping("/{id}")
    public Optional<UserModel> getUserById(@PathVariable Long id){
        
        return this.userService.getUserById(id);
    }
    
    //Crear usuarios
    @PostMapping
    public UserModel createUser(@RequestBody UserModel user){
        
        return this.userService.createUser(user);
    }
    
    //Actualizar usuario
    @PutMapping("/{id}")
    public UserModel updateUser(@RequestBody UserModel user, @PathVariable Long id){
        
        return this.userService.updateUser(user, id);
    }
    
    //Eliminar usuario
    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable Long id){
        
        Boolean ok = this.userService.deleteUser(id);
        
        if(ok){
            return "Se eliminó correctamente el usuario: " + id;
        } else {
            return "No se pudo eliminar el usuario: " + id;
        }
    }
    
}
