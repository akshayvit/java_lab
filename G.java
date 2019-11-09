package aksus1;

import aksus.*;


class F extends C
{
    public void tester()
   {
       //System.out.println(super.a+" "+super.b+" "+super.c+" "+super.d);
          System.out.println(super.b+" "+super.d);
   }
}
class G
{
    public static void main(String args[])
   {
        F f=new F();
         f.tester();
         C c=new C();
        //System.out.println(c.a+" "+c.b+" "+c.c+" "+c.d);
       System.out.println(c.b);
   }
}