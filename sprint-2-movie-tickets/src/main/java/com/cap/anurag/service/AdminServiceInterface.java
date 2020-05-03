package com.cap.anurag.service;

import java.util.List;

import com.cap.anurag.entity.Account;
import com.cap.anurag.entity.Admin;
import com.cap.anurag.entity.City;
import com.cap.anurag.entity.Customer;
import com.cap.anurag.entity.Languages;
import com.cap.anurag.entity.Movies;
import com.cap.anurag.entity.Payments;
import com.cap.anurag.entity.Refund;
import com.cap.anurag.entity.Seats;
import com.cap.anurag.entity.Shows;
import com.cap.anurag.entity.Theatre;
//import com.cap.anurag.entity.User;

public interface AdminServiceInterface {

	Admin aLogin(String uname, String pass);
	City save(City c);
	Theatre save(Theatre t);
	Movies save(Movies m);
	Shows save(Shows s);
	List<City> getCityList();
	List<Theatre> getTheatreList();
	List<Movies> getMovieList();
	List<Shows> getShowList();
	String updateCity(City c);
	String updateTheatre(Theatre t);
	String updateMovies(Movies m);
	String updateShows(Shows s);
	
    void removeCity(int sno);
    void removeTheatre(int theatre_id);
    void removeMovie(int movie_id);
    void removeShow(int sno);
}
