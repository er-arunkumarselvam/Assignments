package scenario_4;
public abstract class India
{
//Create Static Variable
static String capital = "New Delhi";

//Create Abstract Methods
abstract void speakLanguage();

abstract void eat();

abstract void dress();

//Constructor 
public India(String primeMinister)
{
System.out.println("Our Prime Minister is " + primeMinister);
}
public India() {
this("Narendira Modi");
}

}
