package com.quintrex.jf2.demo.controller;
import org.springframework.web.bind.annotation.RestController;

import com.quintrex.jf2.demo.model.Hello;
import com.quintrex.jf2.demo.model.NewUser;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
@RestController
public class HelloController {
	@PostMapping("/User")
	public NewUser NewUser(@RequestParam Integer userNum, @RequestParam String userName, @RequestParam String userPass) {
		NewUser Tom = new NewUser();
		Tom.setUserNum(userNum);
		Tom.setUserName(userName);
		Tom.setPassWord(userPass);
		return Tom;
		
		//Request used: localhost:8080/User?userNum=1&userName=Tommy&userPass=Tommy123
		// Body used: {"userName":"New Username: Tommy","passWord":"New Password: Tommy123","userNum":1}
	}
	@GetMapping("/User")
	public String HelloWorld(@RequestBody NewUser Tommy) {
		String welcomeMsg = "Welcome " +Tommy.getUserName() + " you are the " + Tommy.getUserNum() + " member on this site!";
		return welcomeMsg;
	}
}
