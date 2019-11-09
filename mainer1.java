import java.io.*;
class student
{
String name;
public student()
{
name="unknown";
}
public student(String s)
{
this.name=s;
}
public void showname()
{
System.out.println(name);
}
}
class mainer1
{
public static void main(String[] args) throws Exception
{
student s1=new student();
s1.showname();
BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
String s=bf.readLine();
student s2=new student(s);
s2.showname();
}
}