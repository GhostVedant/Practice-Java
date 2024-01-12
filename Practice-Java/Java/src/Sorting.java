import java.util.Scanner;

public class Sorting {
	public static void main(String[] args) {
		Scanner Sc = new Scanner(System.in);
		int a[] = new int[5];
		int i,j;
		System.out.println("Enter Numbers");
		for(i=0;i<a.length;i++)
		{
			a[i] = Sc.nextInt();
		}
		
		for(i=0;i<a.length;i++)
		{
			for(j=0;j<a.length-1;j++)
			{
					if(a[i]>a[j])
					{
						int temp = a[i];
						a[i]=a[j];
						a[j]=temp;
					}
			}
			System.out.println(a[j]);
		}
		for(i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}

}
