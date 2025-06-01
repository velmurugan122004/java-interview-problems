import java.util.*;
class givemoneytoseller {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("ENTER $1 NOTE IN YOUR HAND:");
		int onedollar=s.nextInt();
		System.out.print("ENTER $5 NOTE IN YOUR HAND:");
		int fivedollar=s.nextInt();
		System.out.print("ENTER PURCHASE AMOUNT:");
		int pur=s.nextInt();
		int min5notes,min1notes;
		if(pur<5)
		{
		    if(onedollar>=pur )
		    {
		    System.out.print("$1 notes available "+ pur);
		    }
		    else
		    {
		        System.out.print("Error -1:you have less number $1 notes ");
		    }
		}
		else if(pur>=5)
		{
		    min5notes=pur/5;
		    min1notes=pur%5;
		    if(min5notes>1)
		    {
		        int z=pur-(min5notes*5);
		        if(z==0)
		        {
		            if(fivedollar>=min5notes && pur==min5notes*5)
		            {
		                System.out.print("$5 notes available:"+min5notes);
		            }
		            else if(min1notes==onedollar && pur==min1notes*1)
		            {
		                System.out.println("$1 notes available:"+min1notes);
		            }
		        }
		        else
		        {
                            if(fivedollar!=0 && fivedollar>=min5notes && onedollar!=0 && onedollar>=min1notes)
                            {   
		               System.out.println("$5 notes available"+min5notes);
		               System.out.println("$1 notes available"+z); 
                            }
                            else
                            { 
                               System.out.println("ERROR $1 and $5 Note not requied purchase amount");
                            }
		        }
		    }
		}
	}
}

