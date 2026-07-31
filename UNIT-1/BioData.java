import java.util.Scanner;

class BioData
{
	public static void main(String args[])
	{
		int dob;
		int age;
		String fullName;

		System.out.println("Enter your full name: ");
		Scanner sc = new Scanner(System.in);
		fullName = sc.nextLine();

		System.out.println("enter your age");
		Scanner sc1 = new Scanner(System.in);
		age = sc1.nextInt();
	
		System.out.println("enter your dob");
		Scanner sc2 = new Scanner(System.in);
		dob = sc2.nextInt();

		System.out.println("your name is " + fullName + "and your is " + age + "add your dob is" + dob);
	}
}