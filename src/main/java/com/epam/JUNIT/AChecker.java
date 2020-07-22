package com.epam.JUNIT;

public class AChecker {

	public String aReplacer(String str) {
		
		StringBuffer str1=new StringBuffer(str);
		if(str1.charAt(0)=='A'&&str1.charAt(1)=='A')
		{
			str1.delete(0,2);
		}
		else if(str1.charAt(0)=='A')
		{
			str1.deleteCharAt(0);
		}
		else if(str1.charAt(1)=='A')
		{
			str1.deleteCharAt(1);
		}
		
		return str1.toString();
	}

	
	
}
