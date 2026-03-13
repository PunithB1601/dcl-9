package com.dcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcl.entity.Movie;
import com.dcl.entity.Platform;
import com.dcl.iservice.PlatformService;
import com.dcl.repo.PlatformRepo;

@Service
public class PlatformServiceImpl implements PlatformService {

	@Autowired
	private PlatformRepo prepo;
	
	@Override
	public Platform createPlatform(Platform platform) {
		return prepo.save(platform);
	}

	@Override
	public Platform getPlatform(Integer platformId) {
		// TODO Auto-generated method stub
		return prepo.findById(platformId).orElse(null);
	}

	@Override
	public List<Platform> getAllMovies(String PlatformName) {
		
		return prepo.findByPlatformName(PlatformName);
	}

}
