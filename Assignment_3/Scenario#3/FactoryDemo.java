//Another Abstract Class with extends Keyword
abstract class FactoryDemo extends SmartPhone
{

// Abstract Methods
abstract void verifyFingerPrint();

abstract void providePattern();

//Non-Abstract Method
void browser()
{
super.browser();
System.out.println("Factory Demo browsing");
}

//Add Variable and Static Variable creates is equal to zero
boolean isOriginalPrice = false;
static int price =0;


}
