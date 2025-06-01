import java.util.*;
class bankloan 
{
public static void main(String[] args) 
{
Scanner s=new Scanner(System.in);
System.out.print("ENTER ACCOUNT NUMBER:");
String accountnum=s.nextLine();
int requestedEmis,eligibleEmis=0;
double requestedloan,eligibleloan=0;
if(accountnum.length()==4 && accountnum.charAt(0)=='1')
{
System.out.print("ENTER YOUR ACCOUNT BALANCE:");
double ab=s.nextDouble();
if(ab>=1000)
{
System.out.print("ENTER YOUR SALARY:");
double salary=s.nextDouble();
System.out.print("ENTER YOUR LOAN TYPE:");
String loantype=s.nextLine();
if(salary>25000 && salary<=50000 && loantype.equals("car"))
{
eligibleloan=500000;
eligibleEmis=36;
}
else if(salary>50000 && salary<=75000 && loantype.equals("house"))
{
eligibleloan=6000000;
eligibleEmis=60;
}
else if(salary>75000 && loantype.equals("business"))
{
eligibleloan=7500000;
eligibleEmis=84;
}
else
{
System.out.print("your salaray is not eligible of amount");
}
System.out.print("ENTER YOUR REQUESTED LOAN");
requestedloan=s.nextDouble();
System.out.print("ENTER YOUR EMIS :");
requestedEmis=s.nextInt();
if(requestedloan<=eligibleloan && requestedEmis<=eligibleEmis)
{
System.out.print("Accountnumber:"+accountnum+"/n Eligibeloan:"+eligibleloan+"/n EligibleEmis:"+eligibleEmis);
}
else
{
System.out.println("ERROR:CHECK YOUR REQUESTED LOAN & REQUESTED EMIS");
}
}
else
{
System.out.print("Your Account Balance is below 1000");
}
}
else
{
System.out.print("ERROR:ACCOUNTNUMBER IS MORE THAN LENGTH OR ACCOUNTNUMBER IS NOT START 1");
}
}
}