class Person
{
 //initialize instance variable
private String name="Richi";
private int age=20;

//methods
void talk()
{
System.out.println("hello i am "+name);
System.out.println("My age is "+ age);
}
}
class Demo
{
 public static void main(String a[])
{
//create person class obj
Person Raju=new Person();
//call tal method
Raju.talk();
//create another person class  obj Sita
Person Sita=new Person();
Sita.talk();
}}
