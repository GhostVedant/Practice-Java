import java.util.Scanner;

public class ion {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int a[] = new int[5];
		int i,j;
		int temp;
		System.out.println("Enter the array elements");
		for(i = 0;i<a.length;i++) {
			a[i] = Sc.nextInt();
		}
		System.out.println("Your Numbers are");
		for(i = 0;i<a.length;i++) {
			System.out.println(a[i]);
		}
		for(i=0;i<a.length;i++) {
			for(j=i+1;j<a.length;j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for(i=0;i<a.length;i++) {
			System.out.println("A" + a[i]);
		}
			
		
	}
}