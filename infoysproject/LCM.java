import java.util.*;
class LCM {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int x=s.nextInt();
		int y=s.nextInt();
		int gcd=1;
		for(int i=1;i<=x && i<=y;++i)
		{
		    if(x%i==0 && y%i==0)
		    {
		        gcd=i;
		    }
		}
		int lcm=(x*y)/gcd;
		System.out.println(lcm);
	}
}

