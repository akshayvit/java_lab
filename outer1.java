class outer1
{
      static int a=1;
      static class inner1
      {
              public static int c=2;
              public void runner()
              {
                      System.out.println(a);
             }
      }
      public static void main(String[] args)
      {
             inner1 inr=new inner1();
             inr.runner();
             System.out.println(inr.c);
      }
}