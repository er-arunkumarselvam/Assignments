class Theatre 
{
public static void main(String[] args)
{
Theatre raja = new Theatre(); //Object Creation
int balance_amount = raja.bookTicket(200); //Method Calling, receive and store data value of balance in balance_amount
System.out.println("After booking ticket " + balance_amount); //Concatination Operator ("String"+value)
}
int bookTicket(int ticket) 
{
int ticket_price = 120;
int result = ticket-ticket_price;
int balance =result;
return balance; //return this value of balance
}
}
