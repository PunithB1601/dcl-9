package com.dcl.iservice;

import java.util.List;

import com.dcl.entity.Movie;
import com.dcl.entity.Platform;

public interface PlatformService {

	public Platform createPlatform(Platform platform);

	public Platform getPlatform(Integer platformId);
	
	public List<Platform> getAllMovies(String PlatformName);
}
