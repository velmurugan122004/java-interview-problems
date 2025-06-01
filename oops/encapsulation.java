import java.util.*;
class Customer {
	public String customerId;
	public String customerName;
	public long contactNumber;
	public String address;
    
    public void displayCustomerDetails() {
		System.out.println("Displaying customer details \n***********");
		System.out.println("Customer Id : " + customerId);
		System.out.println("Customer Name : " + customerName);
		System.out.println("Contact Number : " + contactNumber);
		System.out.println("Address : " + address);
		System.out.println();
	}
}
public class encapsulation {
	public static void main(String args[]) {
		Customer customer = new Customer();
		Scanner s=new Scanner(System.in);
		System.out.println("Enter full details in this format(id,name,address,phnum)");
		customer.customerId =s.nextLine();
		customer.customerName = s.nextLine();
                customer.address = s.nextLine();
		customer.contactNumber = s.nextLong();
		customer.displayCustomerDetails();
	}
}