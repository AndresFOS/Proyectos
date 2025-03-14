
package com.example.crud.services;

import com.example.crud.models.UserModel;
import com.example.crud.repositories.IUserRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    //Inyección de depdencias, con esto establezco una conexión entre el repositorio y los servicios
    //Al hacer esto, traigo las clases de JPA para hacer el CRUD
    @Autowired
    IUserRepository userRepository;
    
    //Método obtener usuarios
    public ArrayList<UserModel> getUsers(){
        return (ArrayList<UserModel>) userRepository.findAll();
    }
    
    //Método guardar usuario
    //Creo un método llamado saveUser que contiene un usuario (UserModel user)
    public UserModel saveUser(UserModel user){
        //Este método buscará en userRepository la clase save de JPA y dentro le meto el (user) que va a guardar
        return userRepository.save(user);
    }
    
    //Método para obtener el usuario por el id
    //Ese Optional es para indicar que el método puede retornar datos o en caso contrario un null
    public Optional<UserModel> getUserById(Long id){
        return userRepository.findById(id);
    }
    
    //Método para actualizar un dato mediante su id
    public UserModel updateUserById(UserModel request, Long id){
        //La variable user va a traer del repositorio el id y luego lo obtiene
        UserModel user = userRepository.findById(id).get();
        
        //acá llenamos el objeto mediante los datos insertados en request
        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());
        
        //Guardamos cambios y retornamos
        return userRepository.save(user);
    }
    
    //Método para eliminar un dato mediante su id
    public Boolean deleteUserById(Long id){
        try {
            userRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
