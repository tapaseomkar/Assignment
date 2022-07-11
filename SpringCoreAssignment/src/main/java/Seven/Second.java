package Seven;

import java.util.Arrays;

public class Second 
{
	int arr2[];

	public int[] getArr2() {
		return arr2;
	}

	public void setArr2(int[] arr2) {
		this.arr2 = arr2;
	}
	
	public void result2()
	{
		Arrays.stream(arr2).forEach(System.out::println);
	}

}
