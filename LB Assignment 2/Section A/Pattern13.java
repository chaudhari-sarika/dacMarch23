class Pattern13{
	public static void main(String[]args)
	{
		for(char i=65;i<=69;i++)
		{
			for(int k=1;k<=69-i;k++)
			{
				System.out.print(" ");
			}
			
			for(int j=65;j<=i;j++)
			{
				System.out.print((char)i+ " ");
			}
		System.out.println();
		}
	}
}