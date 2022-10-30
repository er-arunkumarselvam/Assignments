//Create Abstract Class
abstract class SmartPhone
{
// Abstract Methods
abstract int call(int seconds);

abstract void sendMessage();

abstract void receiveCall();

//Non-Abstract Methods

void browser()
{
//Method Defination
System.out.println("SmartPhone browsing");
}

//Constructor
public SmartPhone()
{
System.out.println("Smartphone under development");
}
}
