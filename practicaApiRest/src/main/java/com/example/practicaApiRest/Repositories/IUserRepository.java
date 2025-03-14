
package com.example.practicaApiRest.Repositories;

import com.example.practicaApiRest.Models.UserModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<UserModel, Long>{
    
}
