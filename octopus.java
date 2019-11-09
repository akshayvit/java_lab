class mythread extends Thread
{
   public void run()
   {
       System.out.println("I am akshay");
   }
}
class mythread1 implements Runnable
{
      public void run()
      {  
           System.out.println("I am boy");
     }
}
class octopus
{
  public static void main(String[] args)
  {
    mythread mt=new mythread();
    mt.start();
    Thread mt1=new Thread(new mythread1());
    mt1.start();
  }
}