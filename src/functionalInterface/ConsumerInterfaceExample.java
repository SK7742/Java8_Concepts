package functionalInterface;

import java.util.function.Consumer;

public class ConsumerInterfaceExample {
	public static void main(String[] args) {
		Consumer<String> consume = (input)->{
			System.out.println("This value is printed using Consumer Interface accept method\n"+input);
		};
		consume.accept("Testing Accept Method");
	}
}
