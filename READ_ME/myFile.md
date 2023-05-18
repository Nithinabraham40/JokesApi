# Welcome to readme-md-generator &#x1F44B; 
![example workflow](https://img.shields.io/badge/Eclipse-Version%3A%202022--09%20(4.25.0)-orange)
![example workflow](https://img.shields.io/badge/SpringBoot-2.2.1-yellowgreen)
![example workflow](https://img.shields.io/badge/Java-8-yellowgreen)
![example workflow](https://img.shields.io/badge/Postman-v10.13-orange)
![example workflow](https://img.shields.io/badge/Documentation-Yes-green)
![example workflow](https://img.shields.io/badge/Manitained%3F-Yes-green)
 >CLI that generate beautiful **ReadME**.md files

  :house:  <b><span style="color: blue;">Homepage</span></b>
  


 # Prerequisties

 - **Eclipse >=4.55.0**
 - **Postman >=10.13**
 


# Install
```
Maven Install
SpringTool Install
```
 # Framework And Language

 - **Framework :  SpringBoot**
 - **Language :  Java**

 # Dependencies Required

 
 - **spring-boot-starter-web**
 - **spring-boot-devtools**
 - **lombok**
 - **spring-boot-starter-test**
 


# Model


```
@Data
@AllArgsConstructor
@NoArgsConstructor

public class Jokes {
	
	private String jokeId;
	private String joke;
	

}
	
	
```


#  Controller


```
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
	
```

#  Service


```
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
	
```


#  Repository


```
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


	
	
	


	
```

	
	


  


	







	



# DataStructure Used

<details>
<summary><b><span style="color: white;">Clickme</span></b> &#x1F4F2; </summary>

*ArrayList*



</details>



  




# Summary

 Spring Project for add some joked to arraylist and then fetchIt
The project will have the following features

**Post Jokes**,
**get jokes**
.






# :handshake:  Contributing
  Contributions,issues and features request are welcome! 
  

  #


  This *README* was generated with &#x2764;&#xFE0F; by <b><span style="color: blue;">readme-md-generator</span></b> 










   
  
  

