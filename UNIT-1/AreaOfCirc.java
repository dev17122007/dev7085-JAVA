import java.lang.*;
import java.util.Scanner;

class AreaOfCirc
{
	public static void main(String args[])
	{
		int r;

		System.out.println("lets find area of circle");
		Scanner sc = new Scanner(System.in);

		r=sc.nextInt();
		System.out.println("Radius :" +(r) );

		int mul;
		System.out.println("Area of circle :" +(3.14 * (r * r) ) );
	}
}