package engine;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("diesel")

public class DieselEngine implements Engine{
	public void start() {
		System.out.println("black smoke manly growl and smell of diesel 'mericaaaaaaaaaaaaaaaaaaaaa");
	}
}
