package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.CrossOrigin;

import com.example.demo.entities.Director;
@RepositoryRestResource(path = "dir")
@CrossOrigin("*")

public interface DirectorRepository extends JpaRepository<Director, Long> {

}
