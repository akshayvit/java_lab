class bank
{
public String bank_name,branch,ifsc;
public void getbank(String name,String b,String ifs)
{
bank_name=name;
branch = b;
ifsc=ifs;
}
public void printer()
{
System.out.println(bank_name+" "+branch+" "+ifsc);
}
}
class sbi extends bank
{
double r=0.07;
public double amount;
sbi(double a)
{
amount=a;
super.getbank("SBI","KOlkata","818383uejhf");
}
public double checkamount()
{
return amount*r/100;
}
}
class hdfc extends bank
{
double r=0.08;
public double amount;
hdfc(double a)
{
amount=a;
super.getbank("AxisI","KOlkata","4345383uejhf");
}
public double checkamount()
{
return amount*r/100;
}
}
class axis extends bank
{
double r=0.09;
public double amount;
axis(double a)
{
amount=a;
super.getbank("Axis","KOlkata","829383uejhf");
}
public double checkamount()
{
return amount*r/100;
}
}
class bankert
{
public static void main(String[] args){
sbi s=new sbi(500000);
hdfc h=new hdfc(500000);
axis a1=new axis(500000);
double a=s.checkamount();
double b=h.checkamount();
double c=a1.checkamount();
double amt=(a>b && a>c) ? a : ((b>a && b>c) ? b:c );
if(amt==a)
{
s.printer();
}
else if(amt==b)
{
h.printer();
}
else
{
a1.printer();
}
}
}