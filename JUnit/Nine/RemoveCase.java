package Nine;

public class RemoveCase
{
	public static String check(String a)
	{
		String d=a.replaceAll("[@$-.]","");
		return d;
	}
	public static void main(String[] args) {
		System.out.println("this is @ Red $car");
	}

}

