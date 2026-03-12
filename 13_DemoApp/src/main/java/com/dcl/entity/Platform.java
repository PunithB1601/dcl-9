package com.dcl.entity;

import java.util.List;

import com.dcl.repo.MoviesRepo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Platform {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer platformId;
	
	private String platformName;
	
	@OneToMany(mappedBy = "platform")
	private List<Movie> movies;
	
	@OneToMany(mappedBy = "platform")
	private List<Subscription> subscriptions;

}
