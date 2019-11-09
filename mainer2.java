import java.io.*;
class rectangle
{
private double length,breadth;
public rectangle()
{
length=breadth=0;
}
public rectangle(double l,double b)
{
length=l;
breadth=b;
}
public rectangle(double l)
{
length=breadth=l;
}
public double area()
{
return length*breadth;
}
}
class mainer2
{
public static void main(String[] args) throws Exception
{
rectangle r1=new rectangle();
System.out.println(r1.area());
BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
double l=Double.parseDouble(bf.readLine());
double b=Double.parseDouble(bf.readLine());
rectangle r2=new rectangle(l,b);
System.out.println(r2.area());
rectangle r3=new rectangle(l);
System.out.println(r3.area());
}
}