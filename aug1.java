import java.io.*;
abstract class shape
{
double a,b;
public shape(double d1,double d2)
{
a=d1;
b=d2;
}
public abstract double area();
}
class rectangle extends shape
{
public rectangle(double x,double y)
{
super(x,y);
}
public double area()
{
return super.a*super.b;
}
public void show()
{
System.out.println("Dimensions: "+super.a+" "+super.b);
}
}
class square extends shape
{
public square(double x)
{
super(x,x);
}
public double area()
{
return super.a*super.b;
}
public void show()
{
System.out.println("Dimensions: "+super.a);
}
}
class triangle extends shape
{
public triangle(double x,double y)
{
super(x,y);
}
public double area()
{
return 0.5*a*b;
}
public void show()
{
System.out.println("Dimensions: "+super.a+" "+super.b);
}
}
class aug1
{
public static void main(String[] args) throws Exception
{
BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
System.out.println("Enter 1st dimension: ");
int a=Integer.parseInt(bf.readLine());
System.out.println("Enter 2nd dimension: ");
int b=Integer.parseInt(bf.readLine());
rectangle r1=new rectangle(a,b);
System.out.println("Area of rectangle: "+r1.area());
r1.show();
square r2=new square(a);
System.out.println("Area of rectangle: "+r2.area());
r2.show();
triangle r3=new triangle(a,b);
System.out.println("Area of rectangle: "+r1.area());
r3.show();
}
}