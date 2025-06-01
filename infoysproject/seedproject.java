import java.util.*;
class seedproject {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
                System.out.print("enter number input:");
		int x=s.nextInt();
                System.out.print("enter seed input:");
		int y=s.nextInt();
		int r,seed,x1;
		seed=x;
		x1=x;
		while(x!=0)
		{
		    r=x%10;
		    seed=seed*r;
		    x=x/10;
		}
		if(y==seed)
		{
		    System.out.print(x1+"is a seed of"+y);
		}
		else
		{
		    System.out.println(x1+"is not a seed of"+y);
		}
	}
}
