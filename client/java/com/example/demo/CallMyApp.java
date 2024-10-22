package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class CallMyApp {

	
	@GetMapping(path="/myusers/{id}")
	public User getUser(@PathVariable("id")int userId)
    {
		String urlpart=System.getenv("MY_PATH");
		System.out.println(urlpart);
	    String URL=urlpart+"/"+userId;
	    System.out.println(URL);
    	User u=RestClient.create().get().uri(URL).retrieve().body(User.class);
    	System.out.println("===================");
    	return u;
   }

}
