package com.springboot.bean.beanapplication;

import com.springboot.bean.beanapplication.testpack.Car;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.GenericApplicationContext;

@SpringBootApplication
public class BeanApplication {

	public static void main(String[] args) {
		SpringApplication.run(BeanApplication.class, args);


		ApplicationContext context  = new ClassPathXmlApplicationContext("ApplicationContext.xml");

		Car car = context.getBean(Car.class);
		System.out.println(car.getEngineData());


	}

}
