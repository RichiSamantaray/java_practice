import java.util.Scanner;
class Student
{
int a,b;
public  Student(int p,int q)
{
a=p;
b=q;
}
int area()
{
return a*b;
}
}
class Exam extends Student
{
int h;
public Exam(int m,int n,int o)
{
super(m,n);
h=o;
}
int volume()
{
return(a*b*h);
}
}
class Test
{
public static void main(String args[])
{
Exam obj=new Exam(2,3,4);
System.out.println("area="+obj.area());
System.out.println("volume="+obj.volume());
}
}