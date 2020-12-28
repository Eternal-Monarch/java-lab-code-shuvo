import java.io.*;
class Area
{
	public static void main(String args[]) throws IOException
	{
		int x,y;
		InputStreamReader isr = new 
                                                          InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		System.out.print("Enter 1st number: ");
		x = Integer.parseInt(br.readLine());
		System.out.print("Enter 2nd number: ");
		y = Integer.parseInt(br.readLine());
		Area ob=new Area();
	    ob.Sqr(x);
		ob.Rec(x,y);
	}
	void Sqr(int a)
	{
		int area;
		area=a*a;
		System.out.println("Area of Square is "+ area);
	}
	void Rec(int a,int b)
	{
		int area;
		area=a*b;	
		System.out.println("Area of Rectangle is "+ area);
	}
}
		   
