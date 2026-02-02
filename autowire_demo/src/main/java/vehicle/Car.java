package vehicle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import engine.Engine;

@Component
public class Car {
	 	
	private Engine engine; //just a reference 
	@Autowired 
	public Car(@Qualifier("diesel") Engine engine) {
		//@qualifier checks if diesel is mentioned explicitly or not if yes then it is injected rather than @primary
		this.engine = engine;
	}
	
	public void drive() {
		engine.start();
		System.out.println("Car started moving");
	}
}
