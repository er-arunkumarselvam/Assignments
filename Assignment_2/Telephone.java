package assignment2.phone1;

public class Telephone
{
public int price = 1500;
public String  name ="Phone";
public void call()
    {
    System.out.println("Calling Facility"); 
    }
    public void receive_call()
    {
    System.out.println("Receiving call facility"); 
    }
public static void main(String[] args)
{
Telephone bsnl = new Telephone();
System.out.println(bsnl.price);
System.out.println(bsnl.name);
bsnl.call();
bsnl.receive_call();
}

}
