/*class R {
	void display() {
		System.out.println("No args");
		}
	void display(int a) {
		System.out.println("1 args");
	}
	void display(int a,int b) {
		System.out.println("2 args");
	}
	void display(int a,int b,int c) {
		System.out.println("3 args");
	}
	
}*/
public class MethodOverloading {
	void display() {
		System.out.println("No args");
		}
	void display(int a) {
		System.out.println("1 args");
	}
	void display(int a,int b) {
		System.out.println("2 args");
	}
	void display(int a,int b,int c) {
		System.out.println("3 args");
	}
	public static void main(String[] args) {
		MethodOverloading b = new MethodOverloading();
		b.display(10,20,30);
	}

}
