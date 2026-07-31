import java.lang.*;
import java.util.Scanner;

class AreaOfTri
{
	public static void main(String args[])
	{
		int b;
		int h;

		System.out.println("lets find area of Triangle");
		Scanner sc = new Scanner(System.in);

		b=sc.nextInt();
		System.out.println("Base :" +(b) );
		
		h=sc.nextInt();
		System.out.println("Height :" +(h) );

		int mul;
		System.out.println("Area of Triangle :" +(0.5 * b * h) );
	}
}