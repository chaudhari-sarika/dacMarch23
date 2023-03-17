class Pattern13{
	public static void main(String[]args)
	{
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=i-1;k++)
			{
					System.out.print(" ");
			}
			for(int j=1;j<=6-i;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
		
		    for(int i=1;i<=4;i++)
			{
				for(int k=1;k<=4-i;k++)
					{
					System.out.print(" ");
			}
			for(int j=1;j<=i+1;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}
}