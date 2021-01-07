class Student 
{
	String sname;
	int roll;
	Student(String s1, int x)
	{
		
		sname = s1;
		roll = x;
	}
}
	class Teacher extends Student
	{
	String subname,tname;
	int id;
	Teacher(String s1,String s2, String s3, String s4, int x)
	{
		super(s1,s2);
		subname=s4;
		tname=s3;
		id = x;
	}
	void show()
	{
		System.out.println("\n ### Student class ###");
		System.out.println("Student Name ->" + sname);
	
		System.out.println("Roll No ->" + roll);
		System.out.println("Teacher id ->" + id);
		
		System.out.println("Teacher Name ->" + tname);
		System.out.println("Subject ->" + subname);
	}
}
class College extends Teacher
{
	String cname,address;
	College(String s1,String s2)
	{	
		cname=s1;
		address=s2;
	}
}
	void show()
	{
		System.out.println("\n ### Teacher class ###");
			System.out.println("Teacher id ->" + id);
			System.out.println("Teacher Name ->" + tname);
			System.out.println("Subject ->" + subname);
		System.out.println("College Name ->" + cname);
		System.out.println("Location ->" + address);
		
	}
	public static void main(String args[])
	{

		Teacher t = new Teacher("Brainware university","Barasat","Object oriented programming lab","Ritesh Prasad",101);
		Student s = new Student("Brainware university","Barasat","Subhasish Dutta",104);
		t.show();
		s.show();
	}
}

