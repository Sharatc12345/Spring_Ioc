package com.example.primitive;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {

	public static void main(String[] args) {
      ApplicationContext ac=new ClassPathXmlApplicationContext("config.xml");
      Students s=(Students)ac.getBean("std1");
      System.out.println(s);
      Students s1=(Students)ac.getBean("std2");
      System.out.println(s1);
      Students s2=(Students)ac.getBean("std3");
      System.out.println(s2);
	}

}
