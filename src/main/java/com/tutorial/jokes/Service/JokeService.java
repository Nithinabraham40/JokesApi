package com.tutorial.jokes.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tutorial.jokes.model.Jokes;
import com.tutorial.jokes.repository.JokeRepo;

@Service
public class JokeService {

	@Autowired
	private JokeRepo jokerepo;
	
	
	public String addJokes(Jokes joke) {
		
		
		jokerepo.addJokes(joke);
		
		return "added sucessfully";
	}


	public List<Jokes> getJokes() {
		
		return jokerepo.getJokes();
	}


	
	
	

}
