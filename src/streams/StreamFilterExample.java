package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFilterExample {

	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		list.add("Satyam");
		list.add("Shivam");
		list.add("Sundram");
		list.add("Amit");
		list.add("Sumit");
		list.add("Rohit");
		System.out.println("ArrayList Is: "+list);
		
		Stream<String> streamObj = list.stream();
		List<String> filteredList = new ArrayList<String>();
		filteredList = streamObj.filter(temp-> temp.contains("a")).collect(Collectors.toList());
		System.out.println("List After Filteration: "+ filteredList);
	}

}
