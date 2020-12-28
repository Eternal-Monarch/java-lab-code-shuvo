import java.io.*; 
class Main
{ 
	public static void main(String[] args) 
	{ 
		StringBuffer s = new StringBuffer("Brainware ");
		StringBuffer s1 = new StringBuffer("University");  
		System.out.println("Length of string " + s.length());
		System.out.println("Append " + s.append( s1));
		System.out.println("Insert " + s.insert(3, s1));
		System.out.println("Reverse   " + s.reverse());
		s.setLength(15);
		System.out.println("Set Length " + s);
	}	 
}
