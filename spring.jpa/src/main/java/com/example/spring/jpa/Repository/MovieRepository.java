package com.example.spring.jpa.Repository;

import com.example.spring.jpa.Model.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


public interface MovieRepository extends JpaRepository<Movie,String>{


}
