package lambdaExpression.LocalVariableMustBeFinal;

public class LocalVariableMustBeFinal {
	int x = 100;
	public void m2() {
		int y = 200;
		Interf interf = ()->{
			System.out.println("ValueOf X:"+x);
			System.out.println("ValueOf Y:"+y);
			
			//changing value of instance variable X
			x=999;
			System.out.println("Changing ValueOf X:"+x);
			//y=999;//changing value of local variable Y will give the complite time error
			//that the value of local variable accessed by lambda expression must be final or effectively final.
			
		};
		interf.method1();
	}
	public static void main(String[] args) {
		LocalVariableMustBeFinal t  = new LocalVariableMustBeFinal();
		t.m2();
	}
}
