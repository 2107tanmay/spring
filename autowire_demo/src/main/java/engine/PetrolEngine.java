package engine;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class PetrolEngine implements Engine {
	public void start() {
		System.out.println("would u love to drink some PETROL from my cup of tea this fine morning sirrrrrrrrrrr");
	}
}
