package com.dcl.iservice;

import com.dcl.entity.Genre;

public interface GenreService {

	public Genre addGenre(Genre g);
	
	public Genre getGenreById(Integer genreId);
}
