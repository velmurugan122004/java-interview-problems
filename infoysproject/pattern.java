class pattern {
	public static void main(String[] args) {
		int x=5,k=0;
		for(int i=1;i<=x;i++)
		{
		    for(int j=1;j<=x-k;j++)
		    {
		        System.out.print("*");
		    }
                    System.out.print("\n");
		    k++;
		}
	}
}
