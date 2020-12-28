interface area 
{
  
void cal (int x);
 
} 
interface perimeter 
{
  
void cal2 (int y);

} 
class Square implements area, perimeter 

{
  
public void cal (int x) 
  {
    
System.out.println ("area of square is " + x * x);
  
} 
public void cal2 (int y) 
  {
    
System.out.println ("perimeter of square is " + 4 * y);

} 
} 
 
class Main 

{
  
public static void main (String args[]) 
  {
    
Square obj = new Square ();
    
obj.cal (4);
    
obj.cal2 (2);

} 
} 
