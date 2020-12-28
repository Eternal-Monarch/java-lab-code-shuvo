class first extends Thread
{
int i;
public void run ()
{
for (i = 1; i <= 5; i++)
System.out.println ("thread is running..." + i);
}
}
class Main
{
public static void main (String args[])
{
first obj1 = new first ();
obj1.start ();
}
}
