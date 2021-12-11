import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test {
	public static Scanner sk =new Scanner(System.in);
	public static void main(String[] args) {
		String[] digit = new String[] {
	            "zero", "one", "two",   "three", "four",
	            "five", "six", "seven", "eight", "nine"
	        };
		int number = sk.nextInt(); 
		List<String> arrList = new ArrayList<>();
		
		if(number != 5) {
			while(number > 0) {
				int rem = number%10;
				arrList.add(digit[rem]);
				number = number/10;
				
			}
			String[] res =new String[arrList.size()];
			int counter = arrList.size()-1;
			for(String temp : arrList) {
				res[counter--]=temp;
				//System.out.print(temp+" ");
			}
			for(int i=0;i<res.length;i++) {
				System.out.print(res[i]+" ");
			}
		}else {
			System.out.println(number);
		}
	}
}
