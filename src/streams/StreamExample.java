package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamExample {
	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		list.add(10);
		list.add(15);
		list.add(20);
		list.add(25);
		list.add(30);
		list.add(50);
		System.out.println("ArrayList Is: "+list);
		//Suppose we want to filter even numbers and store in a new list
		//Approach 1 -- Without Streams
		
		List<Integer> list1 = new ArrayList<Integer>();
		for(Integer e : list) {
			if(e%2==0) {
				list1.add(e);
			}
		}
		System.out.println("Obtained ArrayList By Approach 1 Is: "+list1);
		
		//Approach-2 Streams for getting odd numbers
		List<Integer> list2 = list.stream().filter(temp->temp%2!=0).collect(Collectors.toList());
		System.out.println("Obtained Odd ArrayList By Approach 2 Is: "+list2);
		
		//Above example is used to implement filter stream
		//Now we will try to get the list the same with inputs will be doubled
		
		List<Integer> list3 = list.stream().map(temp->temp*2).collect(Collectors.toList());
		System.out.println("Getting new ArrayList by doubling the values: "+ list3);
	}
}
