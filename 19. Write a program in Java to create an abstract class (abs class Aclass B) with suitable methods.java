abstract class SuitableMethod
{
abstract void show ();
}
public class Abstract extends SuitableMethod
{
void show ()
{
System.out.println ("anything");
} public static void main (String[]args)
{
Abstract obj = new Abstract ();
obj.show ();
}
}
