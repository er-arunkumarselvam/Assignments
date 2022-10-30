//class with interface implements
class ActorSivakumar implements Actor
{
//Static Variable Creation
static String address = "Coimbatore";

//Constructor Creation
ActorSivakumar()
{
System.out.println("ActorSivaKumar Constractor Zero-args Constructor.");
}
ActorSivakumar(int age, String car)
{
System.out.println("Sivakumar Age is "+age);
System.out.println("Sivakumar Car Name is "+car);

}
//Main Method
public static void main(String[] args)
{
ActorSivakumar as= new ActorSivakumar(65, "Audi Car");
//Method Calling Child Class
as.act();
as.dance();
as.sing();
as.speaking();
System.out.println("Sivakumar address is "+address);
//Instance Creation Dynamic Binding
Actor ac =new ActorSivakumar();
//Method calling Dynamic Binding
ac.act();
ac.dance();
ac.sing();

//ac.speaking(); Can't access interface instance in current method
System.out.println("Sivakumar address is "+address);
}
//Instance Method Creation
void speaking()
{
System.out.println("Sivakumar Speaking");
}
//Accessing Interface Methods
public void act()
{
System.out.println("Sivakumar Acting");
}
public void dance()
{
System.out.println("Sivakumar Dancing");
}
public void sing()
{
System.out.println("Sivakumar Singing");
}
}
