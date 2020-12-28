class Main{
public static void main(String args[]){
try{
int a[]=new int[7];
a[7]=30/0;
/*int num=Integer.parseInt ("XYZ") ;
System.out.println(num);*/
System.out.println("First print statement in try block");
}
catch(ArithmeticException shuvo){
System.out.println("Warning:ArithmeticException");
}
catch(ArrayIndexOutOfBoundsException shuvo1){
System.out.println("Warning:Array Index Out Of BoundsException");
}
catch(NumberFormatException e){
System.out.println("Number format exception occurred");
}
catch(Exception e){
System.out.println("Warning:Some Other exception");
}
finally
{
System.out.println("Out of try-catch block");
}
}
}
