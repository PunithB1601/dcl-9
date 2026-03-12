package com.dcl.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dcl.entity.Platform;
@Repository
public interface PlatformRepo extends JpaRepository<Platform, Integer>{

}
