import java.lang.*;
import java.util.Scanner;

class TwoNumber
{
	public static void main(String args[])
	{
		int no1;
		int no2;
		int sum;

		System.out.print("Enter your no1:  ");
		Scanner sc = new Scanner(System.in);

		no1 = sc.nextInt();

		System.out.print("Enter your no2:  ");
		Scanner sc1 = new Scanner(System.in);

		no2 = sc1.nextInt();

		sum= no1 + no2;

		System.out.print("Your sum: " + sum);
	}
}