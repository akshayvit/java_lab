class complex
{
      private static int a1,a2,b1,b2;
      complex(int x,int y,int z,int w)
     {
          a1=x;
          a2=y;
          b1=z;
          b2=w;
     }
     public static String add()
     {
          int comp[]=new int[2];
          comp[0]=a1+a2;
          comp[1]=b1+b2;
          return comp[0]+"+i"+comp[1];
    }
   public static String sub()
   {
         int comp[]=new int[2];
          comp[0]=a1-a2;
          comp[1]=b1-b2;
          return comp[0]+"-i("+comp[1]+")";
   }
   public static String mul()
  {
       int comp[]=new int[2];
          comp[0]=(a1*a2)-(b1*b2);
          comp[1]=(a1*b2+a2*b1);
          return comp[0]+"+i("+comp[1]+")";
  }
  public String toString()
 {
        return "Add: "+add()+" Subtract: "+sub()+" Multiplication: "+ mul();
}
}
class octo2
{
   public static void main(String[] args)
  {
       complex c1=new complex(3,4,5,7);
      System.out.println(c1.toString());
} 
}