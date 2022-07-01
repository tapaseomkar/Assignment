package Fourth;

public class ArmSt 
{
	static boolean isArmstring(int n)
	{
		int temp,digit=0,last=0,sum=0;
		temp=n;
		while(temp>0)
		{
			temp=temp/10;
			digit++;
		}
		temp=n;
		while(temp>0)
		{
			last=temp%10;
			sum+=(Math.pow(last, digit));
			temp=temp/10;
		}
		if(n==sum)
		{
			return true;
		}
		else
		{
			return false;
		}
		
		
	}
	public static void main(String[] args) {
		System.out.println(ArmSt.isArmstring(12));
		System.out.println("Programe for Armstrong number");
	}

}
