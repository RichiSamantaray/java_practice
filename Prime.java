import java.util.Scanner;
class Prime
{
public static void main(String s[])
{
int num,i,c=0;
Scanner sa=new Scanner(System.in);
System.out.println("enter a number");
num=sa.nextInt();

for( i=2;i<num;i++)
{
if(num%i==0)
{
c++; 
break;
}
}
if(c==0)
System.out.println(num+"is prime");
else
System.out.println(num+"is not prime");
}
}