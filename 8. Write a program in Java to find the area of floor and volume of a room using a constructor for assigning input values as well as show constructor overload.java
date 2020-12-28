import java.util.Scanner;
class ClassOver
{
	ClassOver()
	{
		System.out.println("Constructor tests");
	}
	ClassOver(int l, int b)
	{
		int Result;
		Result=l*b;
		System.out.println("Arer of Floor is "+ Result +"cm^2");
	}
	ClassOver(int l,int b, int h)
	{
		int result;
		result=l*b*h;
		System.out.println("Volumn of Room is "+ result +"cm^3");
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the 1st length in cm : ");
		int x = sc.nextInt();
		System.out.print("Enter the 2nd length in cm : ");
		int y = sc.nextInt();
		System.out.print("Enter the 3rd length in cm : ");
		int z = sc.nextInt();
		ClassOver obj1 = new ClassOver();
		ClassOver obj2= new ClassOver(x,y);
		ClassOver obj3 = new ClassOver(x,y,z);
	}
}
