package com.tutorial.jokes.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

public class Jokes {
	
	private String jokeId;
	private String joke;
	

}
