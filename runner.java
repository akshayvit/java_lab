class runner
{
       public static void main(String[] args)
      {   
             Runtime r=Runtime.getRuntime();
             Integer[] intg=new Integer[10];
             System.out.println("Total memory : "+r.totalMemory());
             r.gc();
             System.out.println("Total memory : "+r.totalMemory());
             r.freeMemory();
             System.out.println("Total memory : "+r.totalMemory());
             for(int i=0;i<intg.length;i++)
             {
                   intg[i]=null;
             }
             System.out.println("Total memory : "+r.totalMemory());
      }
}