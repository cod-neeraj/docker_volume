package com.example.docker_volume_practice.Repository;

import com.example.docker_volume_practice.Model.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<Users,Integer> {
}
