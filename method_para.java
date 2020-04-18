//method without parameter without return type
class Sample
{

//instance var
private double num1,num2;
//parameterized constructor
Sample(double x,double y)
{
num1=x;
num2=y;
}

//method to cal sum that doesnot accept any val n doesnt return result
void sum()
{
double res=num1+num2;
System.out.println("Sum is "+ res);
}
}
class Method
{
public static void main(String a[])
{
 Sample s=new Sample(10,2.6);
s.sum();
}
}