package com.tutorial.jokes.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tutorial.jokes.Service.JokeService;
import com.tutorial.jokes.model.Jokes;

@RestController
@RequestMapping("/jokes")
public class JokeControler {

	
	@Autowired
	private JokeService jokeService;
	
	
	
	@PostMapping("add")
	public String addJokes(@RequestBody Jokes joke) {
		
		
		return jokeService.addJokes(joke);
		
	}
	
	@GetMapping("/get")
	
	public List<Jokes>getJokes() {
		
		return jokeService.getJokes();
	}
		
	
}
