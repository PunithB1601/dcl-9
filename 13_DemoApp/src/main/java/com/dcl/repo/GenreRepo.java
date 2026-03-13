package com.dcl.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dcl.entity.Genre;
@Repository
public interface GenreRepo extends JpaRepository<Genre, Integer>{

}
