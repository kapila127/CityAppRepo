package cityTocity.module.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cityTocity.module.model.bo.User;

@Controller
public class UserRegistrationController {

	
	
	@RequestMapping(value="createUser",method=RequestMethod.POST)
	public void createUser(User user){
		
	}
	

	@RequestMapping(value="getUser",method=RequestMethod.GET)
	public User getUser(){
		
		return null;
	}
	
	
}
