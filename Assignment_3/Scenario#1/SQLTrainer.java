//Sub Classs
class SQLTrainer extends Trainer
{

//Main Method
public static void main(String[] args)
{
//Parent Class Object Creation
Trainer trainerKumar=new Trainer("CSE","payilagam");

//Sub Class Object Creation
SQLTrainer ram = new SQLTrainer();
//Methods Calling

System.out.println("My Department is "+ram.dept);
System.out.println("My institute name is "+ram.institute);
System.out.println("My salary is "+ram.getSalary());
trainerKumar.training();
}


}
