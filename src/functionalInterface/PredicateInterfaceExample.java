package functionalInterface;

import java.util.function.Predicate;

public class PredicateInterfaceExample {
	public void testingPredicateMethod(String temp){
		
	}
	public static void main(String[] args) {
		System.out.println("PredicateExample...");
		Predicate <String> test = (temp)->{
			if("pass".equals(temp))
				return true;
			return false;
		};
		System.out.println(test.test("Check"));		//Test method contained by Predicate Interface
		System.out.println(test.test("pass"));		//It will Return boolean only
	}
}
