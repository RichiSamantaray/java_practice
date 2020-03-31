import java.io.*;
import java.util.*;
class Differ
{
    public static void main(String a[]) throws IOException
      {   
	//to accept data from keyboard
	BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//ask for input
System.out.println("enter name, age , salary");

//accept input into a string
String str=br.readLine();
//use stringTokenizer to split input at commas
StringTokenizer st=new StringTokenizer(str,",");

//3 token as string
String s1=st.nextToken();
          
String s2=st.nextToken();

String s3=st.nextToken();

s1=s1.trim();
s2=s2.trim();
s3=s3.trim();
  
String name=s1;
int age=Integer.parseInt(s2);
float sal=Float.parseFloat(s3);

System.out.println("name  "+name);
System.out.println("age  "+age);
System.out.println("sal  "+sal);
}
}
