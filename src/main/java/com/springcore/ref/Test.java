package com.springcore.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
		A tempA = (A) context.getBean("aref");

		System.out.println(tempA.getOb().getY());

		System.out.println(tempA.getX());
	}

}
