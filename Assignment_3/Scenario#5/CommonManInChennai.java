package tamilnadu.chennai;

//Create a Class with implements inteerface
class CommonManInChennai implements TrafficRulesChennai
{
//Main Method
public static void main(String[] args)
{
//Create instance of this class
TrafficRulesChennai driver = new CommonManInChennai();
//Access all the methods
driver.goByDieselVehicle();
driver.goByBicycle();
}
//Defination of all the methods
public void goByDieselVehicle()
{
System.out.println("Chennai Commissioner, "+trafficCommisssioner+ ". He said use Diesel Cars.");
}
public void goByBicycle()
{
System.out.println("Chennai Commissioner, "+trafficCommisssioner+ ". He said use Bicycle.");
}
}
