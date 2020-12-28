class Rectangle
{
	void Area(int len, int wid) 
	{
		int x,y;
		double Rectangle_area;
		x=len;
		y=wid;
		Rectangle_area = len * wid;
		System.out.println("It is the area of Rectangle"+Rectangle_area);
	}
}
class Square extends Rectangle
{
	void Area(int b)
	{
		int x;
		double Square_area;
		x=b;
		Square_area = x*x;
		System.out.println("it is the area of square"+ Square_area);
	}
}
class Main
{
	public static void main(String args[])
	{
		Rectangle obj1 = new Rectangle();
		obj1.Area(4,7);
		Square obj2 = new Square();
		obj2.Area(5);
	}
 }
