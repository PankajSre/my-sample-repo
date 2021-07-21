
public class WrapperDemo {

	public static void main(String[] args) {
		
		int age = 20;
		Integer i = age; // Autoboxing
		System.out.println(i instanceof Integer);
		
		int a = i; //Auto unboxing
		System.out.println(a);
		
	}

}

// Autoboxing ==> 
//Auto Unboxing
