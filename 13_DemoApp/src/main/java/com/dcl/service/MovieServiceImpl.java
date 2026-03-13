package com.dcl.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcl.entity.Movie;
import com.dcl.entity.Platform;
import com.dcl.iservice.MovieService;
import com.dcl.repo.MoviesRepo;
import com.dcl.repo.PlatformRepo;

@Service
public class MovieServiceImpl implements MovieService {

	@Autowired
	private MoviesRepo mrepo;
	
	@Autowired
	private PlatformRepo prepo;

	@Override
	public Movie addMovie(Movie m) {
		// TODO Auto-generated method stub
		return mrepo.save(m);
	}

	@Override
	public Movie getMoviesById(Integer m) {
		
		return mrepo.findById(m).orElse(null);
	}


}
