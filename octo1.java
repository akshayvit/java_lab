class students
{
    private static int id=1;
    private String name;
    private String dept="CSE";
    private int  year;
    students(String s,int y)
   {
        this.name=s;
        this.year=y;
   }
   public String toString()
   {
        return (id++)+" "+name+" "+dept+" "+year;
   }
}
class octo1
{
   public static void main(String[] args)
{
    students[] s=new students[5];
    char a='a';
    int y=0;
    for(int i=0;i<5;i++)
    {
         s[i]=new students(String.valueOf(a++),++y);
         System.out.println(s[i].toString());
    }
}
}