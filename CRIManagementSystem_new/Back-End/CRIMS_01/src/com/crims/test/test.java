package com.crims.test;



import com.crims.pojos.*;
import com.crims.service.TestService;
import com.crims.service.UserService;
import com.crims.serviceImpl.TestServiceImpl;
import com.crims.serviceImpl.UserServiceImpl;

public class test {

	
	public static void main(String[] args) {
		
		TestService ts=new TestServiceImpl();
		Test t = new Test();
		t.setUsername("tarian");
		t.setPassword("123456");
		ts.checkdata(t);
		System.out.println("success!");
	}

}
