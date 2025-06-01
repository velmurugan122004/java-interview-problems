import java.util.*;
class countchickenandrabbit {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter heads in farm:");
		int heads=s.nextInt();
		System.out.print("Enter legs in farm:");
		int legs=s.nextInt();
		int flag=0;
		for(int chicken=0;chicken<=heads;chicken++)
		{
		    int rabbit=heads-chicken;
		    int totallegs=(chicken*2)+(rabbit*4);
		    if(totallegs==legs)
		    {
		        System.out.println("Chickens: "+chicken+", Rabbits: "+rabbit);
		        flag=1;
		        break;
		    }
		}
		if(flag==0)
		{
		    System.out.println("The number of chicken and rabbits cannot be found");
		}
	}
}