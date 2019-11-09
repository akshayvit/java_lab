package aksus;
public class C
{
      int a=2;
    private int c=3;
    public int b=4;
    protected int d=5;
    public void test()
   {
       System.out.println(a+" "+b+" "+c+" "+d);
   }
}
class D extends C
{
    public void tester()
   {
       //System.out.println(super.a+" "+super.b+" "+super.c+" "+super.d);
       System.out.println(super.a+" "+super.b+" "+super.d);
   }
}
class E
{
    public void testing()
   {
         C c=new C();
        //System.out.println(c.a+" "+c.b+" "+c.c+" "+c.d);
        System.out.println(c.a+" "+c.b+" "+c.d);
   }
}