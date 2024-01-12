import java.util.Scanner;

class A extends B{
	int a ;
	Scanner Sc = new Scanner(System.in);
	void getA() {
		System.out.println("Enter A");
		a = Sc.nextInt();
	}
	void putA() {
		System.out.println("A:"+ a);
	}
}
class B  {
	int b ;
	Scanner Sc = new Scanner(System.in);
	void getB() {
		System.out.println("Enter B");
		b = Sc.nextInt();
	}
	void putB() {
		System.out.println("B:"+ b);
	}
}
public class Inheritance {
	public static void main(String[] args) {
		A b1 = new A();
		b1.getA();
		b1.getB();
		b1.putA();
		b1.putB();
	}
}