package com.example.collection;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
public static void main(String[] args) {
	ApplicationContext ac=new ClassPathXmlApplicationContext("config2.xml");
	College c=(College) ac.getBean("c1");
	System.out.println(c);
}
}
