package com.springcore.di;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class DiApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(DiApplication.class, args); //creates our container
		//this is our beanfactory which creates our beans for us automatically 
		//ofc we can add beans manually when there are param contstructors or any processing is done but yeah for now this is sufficient
		
		//Car car = new Car(); //we do this in core java when were naive but not anymore
		// car.drive(); //and now this is supposed to print driving but what happens when were done with this car we need to
		//depend upon the java garbage collection to remove this object from memory for us
		
		Car car = context.getBean(Car.class); //mentos zindagi XD
		//what we do here is use our context or beanfactory to create a bean or obj for us which will be auto destroyed after we are done using it
		//by application context or beanfactory itself not by gc 
		//randomly assume that object is already created and you just need to use it 
		//to automatically create this object you need to use @Component to tell spring okay you need to create object of this class by urself
		car.drive();
	}

}
