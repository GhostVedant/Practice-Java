import java.util.Scanner;

public class Switchcase {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a,b,c,d;
		System.out.print("Enter A:");
		a = sc.nextInt();
		System.out.print("Enter B:");
		b = sc.nextInt();
		System.out.println("1. Add");
		System.out.println("2. Subtract");
		System.out.println("3. Multiply");
		System.out.println("4. Devide");
		
		System.out.print("Enter Your Choice:");
		d = sc.nextInt();
		
		switch(d)
		{
			case 1:
				c = a+b;
				System.out.println("The Solution is: " + c);
				break;
			case 2:
				c = a-b;
				System.out.println("The Solution is: " + c);
				break;
			case 3:
				c = a*b;
				System.out.println("The Solution is: " + c);
				break;
			case 4:
				c = a/b;
				System.out.println("The Solution is: " + c);
				break;
			default :
				System.out.println("YOU ENTER WRONG INPUT");
		}
		
		
	}

}
