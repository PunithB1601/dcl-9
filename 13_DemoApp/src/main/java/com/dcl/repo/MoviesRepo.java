package com.dcl.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dcl.entity.Movie;
@Repository
public interface MoviesRepo extends JpaRepository<Movie, Integer>{

}
