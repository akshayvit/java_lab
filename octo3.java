interface vehicle
{
     public void changegear();
     public void speedup();
     public void printstatus();
}

class bike implements vehicle
{
     static int speed=10;
     static int gear=1;
     public void changegear()
    {
          gear=2;
    }
    public void speedup()
   {
        speed*=10;
   }
   public void printstatus()
  {
       System.out.println(speed+" "+gear);
   }
}

class car implements vehicle
{
     static int speed=20;
     static int gear=3;
     public void changegear()
    {
          gear=2;
    }
    public void speedup()
   {
        speed*=10;
   }
   public void printstatus()
  {
       System.out.println(speed+" "+gear);
   }
}

public class octo3
{
     public static void main(String[] args)
    {
           car c=new car();
           c.changegear();
           c.speedup();
           c.printstatus();
          bike b=new bike();
           b.changegear();
           b.speedup();
           b.printstatus();
    }
}