import java.lang.*;
import java.util.Scanner;

class AreaOfRect
{
	public static void main(String args[])
	{
		int l;
		int b;

		System.out.println("Lets find area of rec");
		Scanner sc = new Scanner (System.in);

		l=sc.nextInt();
		System.out.println("Length : " +(l) );

		b=sc.nextInt();
		System.out.println("Breadth :" +(b) );

		int mul;
		System.out.println("Area of Rectangle :" +(l * b) );
	}
}