import java.util.Scanner;
class Main
{
public static void main(String args[])
{
int rows, n = 1, i, j;
Scanner input = new Scanner(System.in);
System.out.println("Enter the number of rows triangle:");
rows = input.nextInt();
for ( i = 1 ; i <= rows ; i++ )
{
for ( j = 1 ; j <= i ; j++ )
{
System.out.print(n+" ");
n++;
}
System.out.println();
}
}
}
