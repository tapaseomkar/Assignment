package Six;

import java.util.List;

public class Vowel 
{
	String str[];
	

	public String[] getStr() {
		return str;
	}

	public void setStr(String[] str) {
		this.str = str;
	}
	
	public void check()
	{
		for(String s:str)
		{
			String st=s.replaceAll("[aeiouAEIOU]", " ");
			if(s.equals(st))
			{
				System.out.println(s);
			}
		}
	}

}
