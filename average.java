import java.util.*;
import java.lang.*;
class Calculator {
    public double findavg(int num1,int num2,int num3)
    {
        double sum=num1+num2+num3;
        double avg=sum/3;
        avg=Math.round(avg*100.0)/100.0;
        return avg;
    }


}

class average {

	public static void main(String args[]) {
		Calculator calculator = new Calculator();
		Scanner s=new Scanner(System.in);
		int n1=s.nextInt();
		int n2=s.nextInt();
		int n3=s.nextInt();
		System.out.println(calculator.findavg(n1,n2,n3));
	}
}