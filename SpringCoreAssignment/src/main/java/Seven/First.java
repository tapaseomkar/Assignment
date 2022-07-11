package Seven;

import java.lang.invoke.StringConcatException;
import java.util.Arrays;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;

public class First 
{
	int arr1[];
	
	public int[] getArr1() {
		return arr1;
	}

	public void setArr1(int[] arr1) {
		this.arr1 = arr1;
	}

	@Autowired
	Second sec;
	
	public Second getSec() {
		return sec;
	}

	public void setSec(Second sec) {
		this.sec = sec;
	}

	public void result()
	{
		int c1=arr1.length+sec.arr2.length;
		int c[]=new int[c1];
		int max=c[0];
		System.arraycopy(arr1, 0, c, 0, arr1.length);
		System.arraycopy(sec.arr2, 0, c, arr1.length, sec.arr2.length);
		System.out.println(Arrays.toString(c));
		for(int j=1;j<c.length;j++)
		{
			if(c[j]>max)
			{
				max=c[j];
			}
		}
		System.out.println("maximum in array is:  "+max);
	}
	public void max()
	{
		
	}

	

}
