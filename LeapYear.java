import java.io.*;
import java.util.*;
class LeapYear
{
   public static void main(String a[]) throws IOException
	{

//accept input from keyboard
	     BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
     	      
//read data
	 System.out.print("enter year: ");
	int year=Integer.parseInt(br.readLine());


//if century and divisible by 400 then only
if(year % 100==0 && year % 400==0)
System.out.println("it is leap year");
else if(year % 100!=0 && year % 4==0)
System.out.println("it is leap year");
else System.out.println("it is leap year");
}
}
