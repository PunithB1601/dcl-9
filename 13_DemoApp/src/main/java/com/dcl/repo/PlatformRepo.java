package com.dcl.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.dcl.entity.Platform;
import java.util.List;


@Repository
public interface PlatformRepo extends JpaRepository<Platform, Integer>{

	List<Platform> findByPlatformName(String platformName);
}
