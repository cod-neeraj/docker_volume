package com.example.docker_volume_practice.Service;

import com.example.docker_volume_practice.Model.Users;
import com.example.docker_volume_practice.Repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    UserRepo userRepo;

    public boolean putUser(String name){
        Users user = Users.builder()
                .name(name)
                .build();

        userRepo.save(user);
        return true;
    }

    public List<Users> getUsers(){
        List<Users> list = userRepo.findAll();
        return list;
    }
}
