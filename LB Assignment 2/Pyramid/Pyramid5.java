class Pyramid5{
	public static void main(String[]args)
	{
		for(int i=1;i<=9;i++)
		{
			for(int k=1;k<=9-i;k++)
			{
				System.out.print("  ");
			}
			  for(int j=10-i;j<=9;j++)
			{
					System.out.print(j+" ");
			}	
			for(int j1=10-i;j1<=8;j1++)
			{
				System.out.print(j1+ " ");
			}	
		System.out.println();
		}
	}
}