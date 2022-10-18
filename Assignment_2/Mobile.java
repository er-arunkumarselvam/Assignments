package assignment2.phone2;
import assignment2.phone1.Telephone;

public class Mobile extends Telephone
{
int price=15000;
String name="Mobile";

public void sms()
    {
    System.out.println("Messaging Facility"); 
    }
public static void main(String[] args){
Mobile samsung = new Mobile();
System.out.println(samsung.price);
System.out.println(samsung.name);
samsung.call();
samsung.receive_call();
samsung.sms();

}
}
