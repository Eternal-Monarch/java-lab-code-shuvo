abstract class animal
{
abstract void sound();
}
class tiger extends animal
{
void sound()
 
{
System.out.println("serful...");
}
}
class Main
{
public static void main(String args[])
{
tiger obj=new tiger(); obj.sound();
}
}
