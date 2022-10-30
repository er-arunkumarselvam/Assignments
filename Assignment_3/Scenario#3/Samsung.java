class Samsung extends FactoryDemo
{
//Create Static Variable
static int price=5000;

//Main Method
public static void main(String[] args)
{
Samsung sam = new Samsung();
//Access the Method using sam instance
sam.browser();
System.out.println(sam.price);
sam.call(45);
sam.sendMessage();
sam.receiveCall();
sam.verifyFingerPrint();
sam.providePattern();


}
//Abstract Class Method Definations (SmartPhone Class)
int call(int seconds)
{
System.out.println("Call Timing Seconds = "+ seconds);
return seconds;
}
void sendMessage()
{
System.out.println("Send Message has successfull.");
}
void receiveCall()
{
System.out.println("Call Received successfull.");
}
//Abstract Class Method Definations (FactoryDemo Class)
void verifyFingerPrint()
{
System.out.println("Samsung Finger Print Sensor Verified");
}
void providePattern()
{
System.out.println("Samsung add feature Pattern Lock system");
}
}
