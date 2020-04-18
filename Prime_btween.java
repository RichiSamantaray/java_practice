import java.util.Scanner;
public class Prime_btween
{
public static void main(String a[])
{
int low,high,c=0;
Scanner sc=new Scanner(System.in);
System.out.println("enter low:");
low=sc.nextInt();

System.out.println("enter high:");

high=sc.nextInt();
for(int i=low;i<=high;i++)
{
for(int j=2;j<i;j++)
{
if(i%j==0)
{
c=0;
break;
}
else{
c=1;
}
}
if(c==1)
{
System.out.println(i);
}

}
}
}

