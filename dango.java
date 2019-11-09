class parent
{
String a;
int id;
parent()
{
a="Sayak";
id=1;
}
public void show()
{
System.out.println(id+" "+a);
}
}
class child extends parent
{
String x=super.a;
int b=super.id;
String y;
child(String x1,String y1,int b1)
{
y=y1;
}
public void show()
{
System.out.println(b+" "+y+" "+x);
}
}
class dango
{
public static void main(String[] args)
{
child c=new child("akshay","hyu",5);
c.show();
}
}