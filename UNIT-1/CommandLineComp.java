class CommandLineComp
{
	public static void main(String dev[])
	{
		int no1 = Integer.parseInt(dev[0]);
		int no2 = Integer.parseInt(dev[1]);

		if(no1>=no2)
		{
			System.out.println("No, is greater");
		}
		else
		{
			System.out.println("No, is lower");
		}
	}
}