class octopus4
{
    public static String s1="Akshay";
    public static String s2="Chatterjee";
     public static void main(String[] args)
     {
             Thread t1=new Thread(){
                    public void run() {
                           synchronized(s1){
                                   System.out.println(s1);
                                   try{
                                          Thread.sleep(1000);
                                   }
                                   catch(Exception e)
                                  { 
                                           System.out.println("Something wrong");
                                 }
                           }
                        synchronized(s2)
                        {
                                System.out.println(s2);
                                   try{
                                          Thread.sleep(1000);
                                   }
                                   catch(Exception e)
                                  { 
                                           System.out.println("Something wrong");
                                 }
                        }
                    }
             };
               Thread t2=new Thread(){
                    public void run() {
                           synchronized(s2){
                                   System.out.println(s2);
                                   try{
                                          Thread.sleep(1000);
                                   }
                                   catch(Exception e)
                                  { 
                                           System.out.println("Something wrong");
                                 }
                           }
                        synchronized(s1)
                        {
                                System.out.println(s1);
                                   try{
                                          Thread.sleep(1000);
                                   }
                                   catch(Exception e)
                                  { 
                                           System.out.println("Something wrong");
                                 }
                        }
                    }
             };
          t1.start();
          t2.start();
     }
}