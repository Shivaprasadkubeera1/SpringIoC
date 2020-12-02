package com.SpringPatient;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("SpringConfig.xml");
		
		Patient bean = context.getBean("patient",Patient.class);
		
		System.out.println(bean.add());
		System.out.println(bean.name);
		System.out.println(bean.bedNumber);
		
		Doctor bean2 = context.getBean("doctor",Doctor.class);
		System.out.println(bean2.name);
		System.out.println(bean2.doctorId);
		System.out.println(bean2.doTheDoing());
		
		
	}
}
