package com.dcl.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dcl.entity.Genre;
import com.dcl.iservice.GenreService;
import com.dcl.repo.GenreRepo;
@Service
public class GenreServiceImpl implements GenreService {

	@Autowired
	private GenreRepo grepo;
	
	@Override
	public Genre addGenre(Genre g) {
		
		return grepo.save(g);
	}

	@Override
	public Genre getGenreById(Integer genreId) {
		
		return grepo.findById(genreId).orElse(null);
	}

}
