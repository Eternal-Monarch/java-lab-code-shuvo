// Hierarchical inheritance
class College
{
	String cname,address;
	College(String s1,String s2)
	{	
		cname=s1;
		address=s2;
	}
}
class Teacher extends College
{
	String subname,tname;
	int id;
	Teacher(String s1,String s2, String s3, String s4, int x)
	{
		super(s1,s2);
		subname=s3;
		tname=s4;
		id=x;
	}
	void show()
	{
		System.out.println("\n ### Teacher class ###");
		System.out.println("College Name ->" + cname);
		System.out.println("Location ->" + address);
		System.out.println("Teacher Id ->" + id);
		System.out.println("Teacher Name ->" + tname);
		System.out.println("Subject ->" + subname);
	}
}
class Student extends College
{
	String name;
	int roll;
	Student(String s1, String s2,String s3,int x)
	{
		super(s1,s2);
		name = s3;
		roll = x;
	}
	void show()
	{
		System.out.println("\n ### Student class ###");
		System.out.println("College Name ->" + cname);
		System.out.println("Location ->" + address);
		System.out.println("Name ->" + name);
		System.out.println("Roll no. ->" + roll);
	}
	public static void main(String args[])
	{
		Teacher t = new Teacher("Brainware","Barasat","Oops","CAPTAIN AMERICA",101);
		Student s = new Student("Brainware","Barasat","TAYLOR SWIFT",124);
		t.show();
		s.show();
	}
}
