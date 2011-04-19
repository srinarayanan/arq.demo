package com.exp;

import javax.ejb.Local;
import javax.ejb.Stateless;


@Local(GreetingManager.class)
@Stateless
public class GreetingManagerBean implements GreetingManager {

	public String greet(String userName) {
		// TODO Auto-generated method stub
		return "Hello"+userName;
	}

}
