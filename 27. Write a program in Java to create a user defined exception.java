class NegativeNumberException extends Exception
{
  NegativeNumberException (String s)
  {
    super (s);
  }
}
 public class Main
{
  public static void main (String args[])
  {
    int x = 5;			//user input StackTraceElement
      try
    {
      if (x < 0)
	throw new NegativeNumberException ("-ve number not allowed");
      else
        System.out.println ("all seems okay,no Exception found");
    }
    catch (NegativeNumberException obj)
    {
      System.out.println (obj);
    }
  }
}
