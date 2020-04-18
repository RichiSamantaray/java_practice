import java.io.*;

class String
{
public static void main(String a[]) throws IOException
{

//create empty string buffer object
StringBuffer sb=new StringBuffer();

//accept  dat from keyboard
  BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
//accept surname
System.out.println("enter surname:");
String sur=br.readLine();
//accept middle name
System.out.println("enter mid name:");
String mid=br.readLine();

//accept last name
System.out.println("enter last name:");
String last=br.readLine();

//append sur to sb
sb.append(sur);
//append last to sb
sb.append(last);

 //diaplay name
System.out.println("name is " +sb);

//insert insert mid name inbetween
int n=sur.length();       //n is no of char in sur name
sb.insert(n,mid);         //insert mid name after n'th character


System.out.println("Full name is= " +sb);

//reverse name
System.out.println("Full name is= " +sb.reverse());
}
}