interface printable
{
     public void print();
}
interface showable
{
     public void show();
}
public class A4 implements printable,showable
{
       public static void main(String[] args) 
       {
              A4 a=new A4();
              a.print();
              a.show();
       }
        public void print()
     {
          System.out.println("Print");
     }
     public void show()
     {
          System.out.println("Shown");
     }
}