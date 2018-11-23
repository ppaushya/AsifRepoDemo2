package org.cap.boot;

import org.cap.model.Employee;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;

public class TestClass {

	public static void main(String[] args) {
		
		AbstractApplicationContext context= new ClassPathXmlApplicationContext("myBeans.xml");
		
		//AbstractApplicationContext context1= new FileSystemXmlApplicationContext("C:\\Users\\muasif\\Desktop\\myBeanss.xml");
		
		
		
		Employee employee = (Employee) context.getBean("emp");
		
		
		System.out.println(employee);
		
		context.close();
		//context.registerShutdownHook();
		System.out.println("hello how are you!!");
		System.out.println("hello how are you!!");
		System.out.println("you are how hello!!");
		System.out.println("Are you in love? Asif");
		System.out.println("No but you are ...!");
		System.out.println("No but you are ...!");
		System.out.println("hello how are you!!");
		System.out.println("Poonam");
		System.out.println("Asif");
		System.out.println("Asif");
		System.out.println("Asif");
		System.out.println("Asif");


		System.out.println("no i am not");

		System.out.println("Poonam");


	}

}
