class multthread extends Thread
{
   static int i=0;
   public multthread()
   {
      this.i++;
   }
   public void run()
   {
        System.out.println(i);
   }
}
class octopus1
{
   public static void main(String[] args) throws Exception
   {
         for(int i=0;i<5;i++)
         {
             multthread mlt=new multthread();
             mlt.start();
             Thread.sleep(1000);
         }      
   }
}