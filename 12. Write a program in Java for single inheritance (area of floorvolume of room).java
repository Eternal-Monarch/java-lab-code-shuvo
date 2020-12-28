class Floor
{
	int l,b;
	Floor(int x, int y)
	{
		l = x;
		b = y;
	}
	void calArea()
	{
		int a;
		a=l*b;
		System.out.println("Area of floor is " + a);
	}
}
class Room extends Floor
{
	int h;
	Room(int x, int y, int z)
	{
		super(x,y);
		h=z;
	}
	void calvol()
	{
		int v;
		v=l*b*h;
		System.out.println("Volume of Room is " + v);
	}
}
class Main
{
	public static void main(String args[])
	{
		//Floor F1 = new Floor(3,4);
        Room R1 = new Room(3,4,5);
		R1.calArea();
		R1.calvol();
	}
}
