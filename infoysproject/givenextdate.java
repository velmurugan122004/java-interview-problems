import java.util.*;
class givenextdate {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter Day:");
		int day=s.nextInt();
		System.out.print("Enter Month:");
		int month=s.nextInt();
		System.out.print("Enter Year:");
                int year=s.nextInt();
		int daysinmonth=0;
		if(month==4 || month==6 || month==9 || month==11)
		{
		    daysinmonth=30;
		}
		else if(month==2)
		{
                            if(year%400==0 || (year%100!=0 && year%4==0))
		            {
		                daysinmonth=29;
                                System.out.println(daysinmonth);
		            }
		            else
		            {
		                daysinmonth=28;
                                System.out.println(daysinmonth);
		            }
		}
		else
		{
		    daysinmonth=31;
		}
		day++;
		if(day>daysinmonth)
		{
		    day=1;
		    month++;
		    if(month>12)
		    {
		        month=1;
		        year++;
		    }
		}
		System.out.println(day+"-"+month+"-"+year);
	}
}

