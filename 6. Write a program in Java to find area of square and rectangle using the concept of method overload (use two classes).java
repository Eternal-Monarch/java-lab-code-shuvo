import java.util.Scanner;
class Methods
{
		void Area(int a)
		{
			int result;
			result = a*a;
			System.out.println("Area of Square is "+ result 
                                                                                          +"cm^2");
		}
		void Area(int a,int b)
		{
			int area;
			area=a*b;
			System.out.println("Area of Rectangle is "+ area 
                                                                                           +"cm^2");
		}
}
class Main
{
	public static void main(String args[])
	{
			
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the 1st length in cm : ");
		int x = sc.nextInt();
		System.out.print("Enter the 2nd length in cm : ");
		int y = sc.nextInt();
		Methods ob=new Methods();
	         ob.Area(x);
		ob.Area(x,y);
	} 
}
