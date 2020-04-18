
//fibonacci means--The next number is found by adding up the two numbers before it.

import java.io.*;
class Fibo
{
   public static void main(String a[]) throws IOException
      {
	//accept taht much needed
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
System.out.print("enter no of fibonaccis: ");
int n=Integer.parseInt(br.readLine());


//take 1st two fibonacci
long f1=0,f2=1;
System.out.println(f1);
System.out.println(f2);


//next fibo
long f3=f1+f2;
System.out.println(f3);

//already 3 nos printed ,count start at 3
int count=3;
while(count<n)

{
  f1=f2;
f2=f3;
f3=f1+f2;
System.out.println(f3);
count++;
}
}
}

