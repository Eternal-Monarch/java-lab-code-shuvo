class Methods
{
	void add(int a, int b)
	{
		int sum;
		sum=a+b;
		System.out.println("The Sum is " + sum);
	}
}
class NewMethods
{
	void display()
	{
		System.out.println("This is DISPLAY method");
	}
	public static void main(String[] args)
	{
		Methods ob=new Methods();
		NewMethods obj1=new NewMethods();
		ob.add(5,6);
	}
}
