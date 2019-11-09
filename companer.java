class company
{
public String addr="default",ceo="default";

public void address()
{
System.out.println(addr+" "+ceo);
}
}
class amazon extends company
{
String s1,s2;
amazon()
{
s1="amazon";
s2="Jeff Bezos";
}
public void address()
{
System.out.println(s1+" "+s2);
}
}
class flipkart extends company
{
String s1,s2;
flipkart()
{
s1="flipkart";
s2="Sachin bansal";
}
public void address()
{
System.out.println(s1+" "+s2);
}
}
class companer
{
public static void main(String[] args)
{
amazon a=new amazon();
flipkart f=new flipkart();
a.address();
f.address();
}
}