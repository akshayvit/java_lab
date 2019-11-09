import java.io.*;
class employee
{
int id;
String name;
String desg;
String doj;
public void getdetails(int id,String name,String desg,String doj)
{
this.id=id;
this.name=name;
this.desg=desg;
this.doj=doj;
}
public void showdetails()
{
System.out.println("Id: "+id+" Name: "+name+" Designation: "+desg+" Date of joining: "+doj);
}
}
class mainer6
{
public static void main(String[] args) throws Exception{
int id=1;
employee[] e=new employee[10];
for(int i=0;i<10;i++)
{
e[i]=new employee();
}
for(int i=0;i<10;i++)
{
BufferedReader bf=new BufferedReader(new InputStreamReader(System.in));
String name=bf.readLine();
String desg=bf.readLine();
String doj=bf.readLine();
e[i].getdetails(id++,name,desg,doj);
e[i].showdetails();
}
}
}