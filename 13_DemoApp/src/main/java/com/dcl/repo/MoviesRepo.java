package com.dcl.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dcl.entity.Movie;
import com.dcl.entity.Platform;

@Repository
public interface MoviesRepo extends JpaRepository<Movie, Integer>{

	
}
