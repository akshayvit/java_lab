class threader extends Thread
{
     public void run()   
     {
         System.out.println("I am a boy");
     }
}
class octopus3
{
     public static void main(String[] args) throws Exception
     {
         threader th1=new threader();
         threader th2=new threader();
         th1.start();
         th2.start();
         th1.join();
         th2.join();
         if(th2.isAlive())
          {
                System.out.println("It is alive");
          }
         else
         {
                System.out.println("It is dead");
         }
     }
}