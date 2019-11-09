class outer
{
      static int a=1; 
      private static  int b=2;
      static int c=3;
      static class inner
      {
            public void shower()
            {
                       System.out.println(a+" "+b+" "+c);
             }
      }
      public static void  main(String[] args)
      {
                  inner inr=new inner();
                  inr.shower();
       }
}