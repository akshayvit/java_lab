import java.io.*;
class cse_student
{
public static int sid;
public String name;
public static String dept="CSE",clg="STCET";
public cse_student(String n)
{
sid=1;
name=n;
}
public void display()
{
if(sid<=9)
{
System.out.println("CS_0"+(sid++)+" "+name+" "+dept+" "+clg);
}
else
{
System.out.println("CS_"+(sid++)+" "+name+" "+dept+" "+clg);
}
}
}
class aug5
{
public static void main(String[] args) throws Exception
{
BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
cse_student[] cs=new cse_student[5];
for(int i=0;i<5;i++)
{
System.out.println("Enter name: "+(i+1));
String a=bf.readLine() ;
cs[i]=new cse_student(a);
}
for(int i=0;i<5;i++)
{
cs[i].display();
}
}
}