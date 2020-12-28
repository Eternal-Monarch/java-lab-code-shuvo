import java.util.Scanner;
class Main
{
	public static void main(String[] args)
	{
		int add,mul;
		Scanner sc = new Scanner(System.in); 
		System.out.print("Enter the 1st Number: ");
        int a = sc.nextInt();
		System.out.print("Enter the 2nd Number: ");
		int b = sc.nextInt();
		add=a+b;
		mul=a*b;
		System.out.println("THe Sum is " + add);
		System.out.println("The Multiplecation is " + mul);
	}
}
