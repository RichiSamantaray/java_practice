class Methodcall
{
public static void main(String args[])
{
//call method and catch the result
//static method are called by using classname.methodnm();
int res=Methodcall.myMethod(10);

//display res now
System.out.println("result:"+res);
}
static int myMethod(int num)
{
return num*num;
}
}