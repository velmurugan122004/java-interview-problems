import java.util.*;
class checkmultiplyof3and5 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter number:");
		int x=s.nextInt(),x1;
		int flag=0,flag1=0;
		if(x%3==0)
		{
		    flag=1;
		}
		if(x%5==0)
		{
		    flag1=1;
		}
		if(flag==1 && flag1==1)
		{
		    System.out.println("zoom");
		}
		else if(flag==1)
		{
		    System.out.println("zip");
		}
		else if(flag1==1)
		{
		    System.out.println("zap");
		}
		else
		{
		    System.out.println("Invalid");
		}
	}
}

