import java.util.Scanner;
class baseA
{
int x;
int y;
void getdata(int c,int d)
{
x=c;
y=d;
}
}
class deriveB extends baseA
{
int res; 
void result(){
res=x+y;
System.out.println("addition="+res);
}
}
class Single
{
public static void main(String args[])
{
deriveB obj=new deriveB();
obj.getdata(10,20);
obj.result();
}
}
