package scenario_4;
import scenario_4.SouthIndia;
//Class extends with inheritance concept
public class TamilNadu extends SouthIndia
{
//Static Variable Creation
static String capital = "Chennai";

//Main Method
public static void main(String[] args)
{
//Create Instance
SouthIndia si = new TamilNadu();
//Access the static variables
System.out.println("TamilNadu Capital is "+ capital);
System.out.println("India Capital is "+ si.capital);
//Method Calling Abstract class methods and Normal Methods
si.speakLanguage();
si.eat();
si.dress();
si.cultivate();
si.livingStyle();


}
// Abstrat class Method Defination 
public void speakLanguage() {
System.out.println("TamilNadu Mother tongue is Tamil.");
}
 
public void eat() {
System.out.println("Tamil People mostly eat consumed by Rice and Millet Products. ");
}
 
public void dress() {
System.out.println("TamilNadu People wear own Traditional Dresses.");
}
 

//methods overriding
void cultivate()
{
System.out.println("Rice and Sugar cane cultivation");
}

void livingStyle()
{
System.out.println("Above Average development");
}
}
