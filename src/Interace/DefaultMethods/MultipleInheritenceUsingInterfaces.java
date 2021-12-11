package Interace.DefaultMethods;

public class MultipleInheritenceUsingInterfaces implements InterfaceA, InterfaceB{
	@Override
	public void printData() {
		InterfaceA.super.printData(); //toCall method from Interface A
		InterfaceB.super.printData(); //toCall method from Interface B
		System.out.println("Overridden Print Statement...");
	}
	public static void main(String[] args) {
		MultipleInheritenceUsingInterfaces t = new MultipleInheritenceUsingInterfaces();
		t.printData();
	}
}
