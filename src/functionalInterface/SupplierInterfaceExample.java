package functionalInterface;

import java.util.function.Supplier;

public class SupplierInterfaceExample {

	public static void main(String[] args) {
		Supplier<String> supplier = ()->{
			return "This value is supplied from supplier Interface get Method()...";
		};
		System.out.println(supplier.get());
	}

}
