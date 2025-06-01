import java.util.*;
class luckynumber {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter a number:");
		String x=s.nextLine();
		int sum=0;
		for(int i=1;i<x.length();i+=2)
		{
		    Double y=Math.pow(x.charAt(i),2);
		    sum+=y;
		}
		if(sum%9==0)
		{
		    System.out.println("The number "+x+" is a lucky number");
		}
		else
		{
		    System.out.println("The number "+x+" is not a lucky number");
		}
	}
}
