package com.dcl.runner;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.Scanner;
import com.dcl.repo.PlatformRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.dcl.entity.Genre;
import com.dcl.entity.Movie;
import com.dcl.entity.Platform;
import com.dcl.entity.Profile;
import com.dcl.entity.Subscription;
import com.dcl.entity.User;
import com.dcl.iservice.GenreService;
import com.dcl.iservice.MovieService;
import com.dcl.iservice.PlatformService;
import com.dcl.iservice.ProfileService;
import com.dcl.iservice.SubscriptionService;
import com.dcl.iservice.UserService;

@Component
public class TestRunner implements CommandLineRunner {

    private final PlatformRepo platformRepo;

	@Autowired
	private UserService uservice;
	
	@Autowired
	private ProfileService pservice;
	
	@Autowired
	private PlatformService platformService;
	
	@Autowired
	private MovieService mservice;
	
	@Autowired
	private SubscriptionService subservice;
	
	@Autowired
	private GenreService gservice;

    TestRunner(PlatformRepo platformRepo) {
        this.platformRepo = platformRepo;
    }
	
	@Override
	public void run(String... args) throws Exception {
		Scanner sc=new Scanner(System.in);
		
		//User u=uservice.getUser(3);
		//Platform p=platformService.getPlatform(4);
		/*
		 * Platform platform=new Platform(); platform.setPlatformName("Amazon");
		 * platformService.createPlatform(platform);
		 * 
		 * Movie m1=new Movie(); m1.setTitle("KGF Chapter-1");
		 * m1.setLanguage("Kannada"); m1.setRating(4.9); m1.setPlatform(platform);
		 * 
		 * Movie m2=new Movie(); m2.setTitle("Kantara"); m2.setLanguage("Kannada");
		 * m2.setRating(4.8); m2.setPlatform(platform);
		 * 
		 * mservice.addMovie(m1); mservice.addMovie(m2);
		 */
		
		/*
		 * User u=new User(); u.setUsername("Ravi"); u.setEmail("ravi@gmail.com");
		 * u.setPassword("1234"); uservice.createUser(u);
		 */
		
		/*
		 * Platform p=new Platform(); p.setPlatformName("Zee5");
		 * platformService.createPlatform(p);
		 */
		/*
		 * Subscription sub=new Subscription(); sub.setUser(u); sub.setPlatform(p);
		 * subservice.addSubscription(sub);
		 */
		/*
		 * Movie m1=new Movie(); m1.setTitle("Mark"); m1.setLanguage("Kannada");
		 * m1.setPlatform(p); m1.setRating(4.3); mservice.addMovie(m1);
		 * 
		 * Movie m2=new Movie(); m2.setTitle("Max"); m2.setLanguage("Kannada");
		 * m2.setPlatform(p); m2.setRating(4.3); mservice.addMovie(m2);
		 * 
		 * u.setMovies(Arrays.asList(m1)); uservice.createUser(u);
		 */
		
		/*
		 * Genre g1=new Genre(); g1.setName("Action"); Genre g2=new Genre();
		 * g2.setName("Drama"); Genre g3=new Genre(); g3.setName("Thriller");
		 * gservice.addGenre(g1); gservice.addGenre(g2); gservice.addGenre(g3);
		 * 
		 * Movie m=mservice.getMoviesById(5); m.setGenres(Arrays.asList(g1,g2));
		 * mservice.addMovie(m);
		 */
		
		System.out.println("Enter the platform:");
		//mservice.getMovies(sc.next()).forEach(System.out::println);
		platformService.getAllMovies(sc.next()).forEach(System.out::println);
	}

}
