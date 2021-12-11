package functionalInterface;

import java.util.function.Function;

public class FunctionInterfaceExample {
	public static void main(String[] args) {
		Function<Integer, Boolean> checkForPrime = (temp)->{
			for(int i = 2; i<temp/2; i++) {
				if(temp%i==0)
					return false;
			}
			return true;
		};
		int x =10;
		if(checkForPrime.apply(5)) {
			System.out.println(x +" is a prime number");
		}else { 
			System.out.println(x +" is not a prime number");
		}
	}
}
