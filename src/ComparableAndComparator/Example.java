package ComparableAndComparator;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Example {
	public static void main(String[] args) {
		int[] array = {10,40,5,0,6,4,0,2,30,2,5,0,3,5,0,5,3,10,12,0};
		List<Integer> list = Arrays.stream(array).boxed().toList();
		
		//sorting using comparable
		List<Integer> sortedList;
		sortedList = list.stream().sorted((x,y)-> x.compareTo(y)).collect(Collectors.toList());
		System.out.println("List sorted is ASC order...using comparable");
		sortedList.forEach((x)->{
			System.out.print(x+" ");
		});
		
		//sorting in desc order using comparable for arrays
		sortedList = Arrays.stream(array).boxed().sorted((x,y)-> -x.compareTo(y)).collect(Collectors.toList());
		System.out.println("\nList sorted is DESC order...using comparable");
		sortedList.forEach((x)->{
			System.out.print(x+" ");
		});
		
		Comparator<Integer> asc = (x,y)-> (x>y)?1:(x<y)?-1:0;
		sortedList = list.stream().sorted(asc).collect(Collectors.toList());
		System.out.println("\nList sorted is ASC order...using comparator");
		sortedList.forEach((x)->{
			System.out.print(x+" ");
		});
		
		Comparator<Integer> desc = (x,y)-> (x>y)?-1:(x<y)?1:0;
		sortedList = Arrays.stream(array).boxed().sorted(desc).collect(Collectors.toList());
		System.out.println("\nList sorted is DESC order...using comparator");
		sortedList.forEach((x)->{
			System.out.print(x+" ");
		});
	}
	
}	
