package Twelve;

public class Student implements Cloneable
{
	int id;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	
	public static boolean checkClone(Student s1, Student s2)
	{
		if((s1.id==s2.id) && s1.name.equals(s2.name))
		{
			return true;
		}
		else
			return false;
	}
	
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Student s1=new Student(102,"ok");
		Student s2=(Student) s1.clone();
		
		
		
	}
}
