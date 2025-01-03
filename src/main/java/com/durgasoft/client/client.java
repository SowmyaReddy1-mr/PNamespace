package com.durgasoft.client;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.durgasoft.beans.Employee;

public class client 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("com/durgasoft/cfgs/spring.xml");
		Employee emp = (Employee) context.getBean("employeebean");
		emp.print();
	}

}
