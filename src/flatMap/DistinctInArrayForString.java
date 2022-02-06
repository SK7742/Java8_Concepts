package flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DistinctInArrayForString {
	public static void main(String[] args) {
		String[] array = {"Shivam", "KumAr"};
		Stream<String> arrayStream = Arrays.stream(array);
		List<String> list = arrayStream.map(s -> s.split("")).flatMap(Arrays :: stream).distinct().collect(Collectors.toList());
		list.forEach(e->{
			System.out.println(e);
		});
	}
	
	
}
