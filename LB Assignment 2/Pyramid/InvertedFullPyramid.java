class InvertedFullPyramid{
	public static void main(String[]args)
	{
		for(int i=1;i<=6;i++)
		{
			for(int k=1;k<=i-1;k++)
			{
					System.out.print(" ");
			}
			for(int j=1;j<=7-i;j++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}
	}
}
