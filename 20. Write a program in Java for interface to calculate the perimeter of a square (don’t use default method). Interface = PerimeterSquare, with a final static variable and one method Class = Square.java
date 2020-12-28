interface Area
{
	public void area();	
}
interface Perimeter
{
	public void perimeter();
}
class square implements Area,Perimeter
{
	int s=10;
	public void area()
	{
		System.out.println("Area of square "+s*s);
	}
	public void perimeter()
	{
		System.out.println("perimeter of square "+4*s);
	}
}
class multi_interface
{
	public static void main(String args[]){
	square obj=new square();
	obj.area();
	obj.perimeter();
	}
}
