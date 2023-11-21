package com.example.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
		College clg=(College) ac.getBean("coll1");
		System.out.println(clg);
		System.out.println(clg.getStd());
	}

}
