package com.example.demo;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestClient;

@RestController
public class GetData {

	@GetMapping(path="/myusers/{userId}")
	public User getUser(@PathVariable("userId")int userId)
    {
	    String URL="https://jsonplaceholder.typicode.com/posts/"+userId;
	    System.out.println(" in server");
    	User u=RestClient.create().get().uri(URL).retrieve().body(User.class);
    	
    	return u;
   }
}
