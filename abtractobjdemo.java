abstract class ab_demo
{
public abstract int demoter();
}
class demo extends ab_demo
{
public int demoter()
{
return 1;
}
}
class abtractobjdemo
{
public static void main(String[] args)
{
demo d=new demo();
System.out.println("Value: "+d.demoter());
}
}