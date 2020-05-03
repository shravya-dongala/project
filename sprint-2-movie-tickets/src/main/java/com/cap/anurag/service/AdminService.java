package com.cap.anurag.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cap.anurag.dao.AccountDao;
import com.cap.anurag.dao.AdminDao;
import com.cap.anurag.dao.CityDao;
import com.cap.anurag.dao.CustomerDao;
import com.cap.anurag.dao.LanguagesDao;
import com.cap.anurag.dao.MoviesDao;
import com.cap.anurag.dao.PaymentDao;
import com.cap.anurag.dao.RefundDao;
import com.cap.anurag.dao.SeatsDao;
import com.cap.anurag.dao.ShowsDao;
import com.cap.anurag.dao.TheatreDao;
//import com.cap.anurag.dao.UserDao;
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

@Service
@Transactional
public class AdminService implements AdminServiceInterface  {

	@Autowired
	private AccountDao validation;
	@Autowired
	private CityDao city;
	@Autowired
	private TheatreDao theatre;
	@Autowired
	private MoviesDao movie;
	@Autowired
	private ShowsDao shows;
	@Autowired
	private LanguagesDao language;
	@Autowired
	private SeatsDao seats;
	@Autowired
	private CustomerDao account;
	@Autowired 
	private PaymentDao payment;
	@Autowired
	private RefundDao refund;
	@Autowired
	private AdminDao admin;
	
	//@Autowired
	//private UserDao user;
	 

	//Login of an admin  
	@Override
	public Admin aLogin(String uname, String pass) {
		return admin.aLogin(uname, pass);
	}
	@Override
	public City save(City c)
    {
   	 return city.save(c);
    }
	@Override
	public Theatre save(Theatre t)
    {
   	 return theatre.save(t);
    }
	@Override
	public Movies save(Movies m)
    {
   	 return movie.save(m);
    }
	@Override
	public Shows save(Shows s)
    {
   	 return shows.save(s);
    }
	@Override
	public List<City> getCityList() {
		return city.getCityList();
	}
	@Override
	public List<Movies> getMovieList() {
		return movie.getMovieList();
	}
	@Override
	public List<Theatre> getTheatreList() {
		return theatre.getTheatreList();
	}
	@Override
	public List<Shows> getShowList() {
		return shows.getShowList();
	}
	
	
	@Override
	public String updateCity(City c) {
		boolean bool = city.existsById(c.getSno());
		if(bool == true) {
			city.save(c);
			return "cities were updated successfully!!";
		}
		else {
			return "sorry, cities were not updated";
		}
	}
	@Override
	public String updateTheatre(Theatre t) {
		boolean bool = theatre.existsById(t.getTheatre_id());
		if(bool == true) {
			theatre.save(t);
			return "theatres were updated successfully!!";
		}
		else {
			return "theatres were not updated";
		}
	}
	@Override
	public String updateMovies(Movies m) {
		boolean bool = movie.existsById(m.getMovie_id());
		if(bool == true) {
			movie.save(m);
			return "movies were updated successfully!!";
		}
		else {
			return "movies were not updated";
		}
	}
	@Override
	public String updateShows(Shows s) {
		boolean bool = shows.existsById(s.getSno());
		if(bool == true) {
			shows.save(s);
			return "shows were updated successfully!!";
		}
		else {
			return "shows were not updated";
		}
	}
    @Override
    public void removeCity(int sno)
    {
   	  city.deleteById(sno);
    }
    @Override
    public void removeTheatre(int theatre_id)
    {
   	  theatre.deleteById(theatre_id);
    }
    @Override
    public void removeMovie(int movie_id)
    {
   	  movie.deleteById(movie_id);
    }
    @Override
    public void removeShow(int sno)
    {
   	  shows.deleteById(sno);
    }
	
}