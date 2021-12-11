import java.util.function.Predicate;

public class FunctionalInterFaces {
	public static void main(String[] args) {
		
		Predicate<Integer> StringLength = (s)->s < 5;
		System.out.println(StringLength.test(6));
	}
}
