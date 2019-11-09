class stopwatch
{
      static int c=0;
      public void runtimer()
      {
           if(c<=9)
           {
                System.out.println("00:00:0"+(c++));
           }
           else
          {
               System.out.println("00:00:"+(c++));
          }
      }
}
class watcher
{
     public static void main(String[] args)
     {
          stopwatch sw=new stopwatch();
          for(int i=1;i<=15;i++)
          { 
                sw.runtimer();
          }
     }
}