class mthrd extends Thread
{
     synchronized void print()
    {
         System.out.println("I am a boy");
    }
      public void run() 
      {
           print();
      }
}
class octopus2
{
      public static void main(String[] args)
      {
          mthrd mt=new mthrd(); 
          mthrd mt1=new mthrd();
          mt.start();
          mt1.start();
       }
}