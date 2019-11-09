import java.io.*;
class addamount
{
double amount=50;
addamount()
{
amount=50;
}
addamount(double a)
{
amount+=a;
}
public void display()
{
System.out.println(amount);
}
}
class mainer3
{
public static void main(String[] args) throws Exception
{
addamount a=new addamount();
a.display();
System.out.println("What to add? ");
BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
Double am=Double.parseDouble(bf.readLine());
a=new addamount(am);
a.display();
}
}