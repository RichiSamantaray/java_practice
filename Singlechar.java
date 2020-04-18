
import java.io.*;
class Singlechar
{
public static void main(String a[]) throws IOException
{
BufferedReader cool=new BufferedReader( new InputStreamReader(System.in));
System.out.println("Enter a character");
char ch =(char)cool.read();
System.out.println("entered char: "+ ch);
}
}
