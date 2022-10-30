package india.newDelhi;
//import file
import tamilnadu.chennai.TrafficRulesChennai;

//Class Creation with implements interface 
class CommonManInDelhi implements TrafficRulesDelhi, TrafficRulesChennai
{
//Main Method
public static void main(String[] args)
{
//Object Creation in this Class
TrafficRulesDelhi driver= new CommonManInDelhi();
TrafficRulesChennai driver1= new CommonManInDelhi();
driver.dontGoByDieselVehicle();
driver1.goByDieselVehicle();
driver1.goByBicycle();


}
//Method Defination
public void dontGoByDieselVehicle(){
System.out.println("Delhi Commissioner, He said don't use Diesel Vehicle.");
}

public void goByDieselVehicle()
{
System.out.println("Chennai Commissioner, He said use Diesel Cars.");
}
public void goByBicycle()
{
System.out.println("Chennai Commissioner,  He said use Bicycle.");
}
}
