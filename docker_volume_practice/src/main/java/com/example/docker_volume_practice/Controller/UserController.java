package com.example.docker_volume_practice.Controller;

import com.example.docker_volume_practice.Model.Users;
import com.example.docker_volume_practice.Service.UserService;
import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    UserService userService;

    @PostMapping("/putUser/{name}")
    public String putUser(@PathVariable  String name){
        boolean bool = userService.putUser(name);
        if(bool){
            return "saved";
        }
        return "not saved";

    }

    @GetMapping("/getUsers")
    public List<Users> getAllUsers(){
        return userService.getUsers();
    }
}
