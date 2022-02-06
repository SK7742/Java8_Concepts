package flatMap;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class DistinctInArrayForInteger {
	public static void main(String[] args) {
		int[] array = {1,2,3};
		int[] array2 = {1,4,5,3};
		List<Integer> list1 =	IntStream.of(array).boxed().toList();
		List<Integer> list2 =	IntStream.of(array2).boxed().toList();
		List finalList = list1.stream().collect(Collectors.toList());
		finalList.addAll(list2.stream().filter(x -> !list1.contains(x)).collect(Collectors.toList()));
		finalList.forEach( System.out :: println);
	}
}
