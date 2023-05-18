package com.tutorial.jokes.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.tutorial.jokes.model.Jokes;

@Repository
public class JokeRepo {
	
	
	ArrayList<Jokes>allJokes=new ArrayList<>();

	public void addJokes(Jokes joke) {
		
		allJokes.add(joke);
		
	}

	public List<Jokes> getJokes() {
		
		
		return allJokes;
	}

}
