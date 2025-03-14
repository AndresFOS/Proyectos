
package com.example.practicaApiRest.Services;

import com.example.practicaApiRest.Models.UserModel;
import com.example.practicaApiRest.Repositories.IUserRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    
    @Autowired
    private IUserRepository userRepository;
    
    public List<UserModel> getUsers(){
        
        return userRepository.findAll();
    }
    
    public Optional<UserModel> getUserById(Long id){
        
        return userRepository.findById(id);
    }
    
    public UserModel createUser(UserModel user){
        
        return userRepository.save(user);
    }
    
    public UserModel updateUser(UserModel user, Long id){
        //Buscar el id
        UserModel buscarUser = userRepository.findById(id).get();
        
        buscarUser.setFirstName(user.getFirstName());
        buscarUser.setLastName(user.getLastName());
        buscarUser.setEmail(user.getEmail());
        
        return userRepository.save(buscarUser);
    }
    
    public Boolean deleteUser(Long id){
        
        try {
            userRepository.deleteById(id);
            return true;
        } catch (Exception e) {
            return false;
        }
    }
    
}
