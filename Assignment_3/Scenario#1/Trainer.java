class Trainer
{
//Default Instance Variable
String dept="Java";
String institute="Payilagam";

//Private Instance Variable
private int salary =10000;


//Constructor
Trainer()
{
System.out.println("Trainer Class Constructor");
}
Trainer(String dept, String institute)
{
this.dept=dept;
this.institute = institute;
}

//Getter Method
int getSalary()
{
return this.salary;
}

//Instance Method
public void training()
{
System.out.println("Creating Training Method");
}

}
