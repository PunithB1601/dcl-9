package com.dcl.iservice;

import java.util.List;

import com.dcl.entity.Movie;

public interface MovieService {
	
	public Movie addMovie(Movie m);
	
	public Movie getMoviesById(Integer movieId);
	
	public List<Movie> getMovies(String platformName);
}
