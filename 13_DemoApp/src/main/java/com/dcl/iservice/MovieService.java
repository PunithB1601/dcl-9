package com.dcl.iservice;

import java.util.List;

import com.dcl.entity.Movie;
import com.dcl.entity.Platform;

public interface MovieService {
	
	public Movie addMovie(Movie m);
	
	public Movie getMoviesById(Integer movieId);
	
	
}
