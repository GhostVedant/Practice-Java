class A1 {
	void display() {
		System.out.println("You are in A");
	}
	
}
class B1 extends A1 {
	void display() {
		super.display();
		System.out.println("You are in B");
	}
}
class C1 extends B1 {
	void display() {
		super.display();
		System.out.println("You are in C");
	}
}
public class MethodOverriding {
	public static void main(String[] args) {
		C1 b = new C1();
		b.display();	
	} 
	
	
}
