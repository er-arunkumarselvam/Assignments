class Trainer
{
//Default Instance Variable
String dept="Java";
String institute="Payilagam";

//Private Instance Variable
private int salary =10000;


//Constructor
Trainer(String dept, String institute)
{
this.dept=dept;
this.institute = institute;
}

//Getter Method
public int getSalary()
{
return this.salary;
}

//Instance Method
public void training()
{
System.out.println("Creating Training Method");
}

}

//Sub Classs
class SQLTrainer extends Trainer
{

//Constructor Calling 
SQLTrainer()
{
super(dept, institute);
System.out.println();
}

//Main Method
public static void main(String[] args)
{
//Parent Class Object Creation
Trainer trainerKumar =new Trainer("CSE","payilagam");
//Sub Class Object Creation
SQLTrainer ram = new SQLTrainer();
ram.training();
//System.out.println("My salary is "+ram.salary);
}


}
