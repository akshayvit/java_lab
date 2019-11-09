class a
{
public void meth()
{
System.out.println("Derived ultimately from a");
}
}
class b extends a
{
public void meth1()
{
System.out.println("For b: ");
super.meth();
}
}
class c extends b
{
public void meth2()
{
System.out.println("For c: ");
super.meth1();
}
}
class d extends a
{
public void meth2()
{
System.out.println("For d: ");
super.meth();
}
}
class systemer
{
public static void main(String[] args)
{
b o1=new b();
o1.meth1();
c o2=new c();
o2.meth2();
d o3=new d();
o3.meth2();
}
}