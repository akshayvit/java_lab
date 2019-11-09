class static_demo
{
public static int a=5,b;
static
{
b=4*a;
}
public static void member()
{
System.out.println(a+" "+b);
}
public static void main(String[] args)
{
member();
}
}