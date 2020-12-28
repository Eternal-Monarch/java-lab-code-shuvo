import java.util.Scanner;

class Bank{
    String name;
    int id;
    double bal;
    Bank(String s,int i,double b)
    {
        name=s;
        id=i;
        bal=b;
    }
    void diposit(double x)
    {
        bal=bal+x;
        System.out.println("Successfully Diposited");
    }
    void withdraw(double x)
    {
        bal=bal-x;
        System.out.println("Collect your Cash");
    }
    void display()
    {
        System.out.println("Mr. "+name+"\n"+"id "+id+"\n"+"Current Amount "+bal);
    }
}
class Main
{
    public static void main(String args[]) {
        Bank b=new Bank("Serful sk",101,1000);
        b.display();
        System.out.println("Enter Diposit Amount");
	Scanner sc=new Scanner(System.in);
	double x=sc.nextDouble();
	b.diposit(x);
	b.display();
	System.out.println("Enter withdrawal Amount");
	x=sc.nextDouble();
	b.withdraw(x);
	b.display();
    }
}
