package com.epam.JUnit;

public class RemoveAs {

	public String remAs(String string) {
		// TODO Auto-generated method stub
		if(string.length()==0)
			return null;
		int i=string.indexOf('A');
		if(i>1||i==-1)
			return string;
		if(i==0)
		{
			string=string.substring(1);
			i=string.indexOf('A');
			if(i==0)
				return string.substring(1);
			return string;
		}
		else {
			return string.charAt(0)+string.substring(2);
		}
	
	}
	

}
