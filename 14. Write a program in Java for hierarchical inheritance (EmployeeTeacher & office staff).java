class Employee
{
void show ()
{
System.out.println ("I am an Employee of BWU");
}
}
class Teacher extends Employee
{
void showPost ()
{
super.show ();
System.out.println ("I am a Teacher");
}
}
class OfficeStaff extends Employee
{
void showPost ()
{
super.show ();
System.out.println ("I am a Office Staff");
}
}
public class Main
{
public static void main (String[]args)
{
Teacher t = new Teacher ();
OfficeStaff o = new OfficeStaff ();
t.showPost ();
o.showPost ();
}
}
