import java.util.*;
class swiggy
{
public static void main(String[] args)
{
Scanner s=new Scanner (System.in);
System.out.print("ENTER DISH VEG(V) OR NON VEG(N):");
char type=s.next().charAt(0);
char type1=Character.toLowerCase(type);
int quan,dis,rate,del;
System.out.print("ENTER QUANTITY OF FOOD:");
quan=s.nextInt();
System.out.print("ENTER DISTANCE OF YOUR HOME:");
dis=s.nextInt();
switch(type1)
{
case 'v':
if(quan>=1)
{
if(dis==0)
{
System.out.print(rate=-1);
}
else if(dis<=3)
{
System.out.println(rate=12*quan);
}
else if(dis>3 && dis<=6 )
{
del=3*0+(dis-3)*1;
System.out.println(rate=12*quan+del);
}
else
{
del=3*0+3*1+(dis-6)*2;
System.out.println(rate=12*quan+del);
}
}
break;
case 'n':
if(quan>=1)
{
if(dis==0)
{
System.out.println(rate=-1);
}
else if(dis<=3)
{
System.out.print(rate=15*quan);
}
else if(dis>3 && dis<=6)
{
del=3*0+(dis-3)*1;
System.out.println(rate=15*quan+del);
}
else 
{
del=3*0+3*1+(dis-6)*2;
System.out.println(rate=15*quan+del);
}
}
break;
default:
rate=-1;
System.out.println(rate);
}
}
}