package geekster;
import java.util.Scanner;

public class B {

	public static void add(int x,int y) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("provide the nos");
		
		x=scan.nextInt();
		y=scan.nextInt();
		
		System.out.println("first number is " +x);
		System.out.println("second number is " +y);
		System.out.println(x+y);
		
		scan.close();
		
	}
	
	public void sum(int m,int n) {
		Scanner scan= new Scanner(System.in);
		
		System.out.println("provide the nos");
		
		m=scan.nextInt();
		n=scan.nextInt();
				
		System.out.println("first no is " +m);
		System.out.println("second no is " +n);
		System.out.println(m+n);
		
		scan.close();
		
		
	}
	
}
