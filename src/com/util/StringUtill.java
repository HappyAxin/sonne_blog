package com.util;

/**
* @ClassName: StringUtil 
* @Description: �ַ�����������
* @author ����
* @date 2016-4-30 ����10:26:48 
* @version 1.0
 */
public final class StringUtill
{
	private StringUtill()
	{
	}
	
	public static boolean isStringEmpty(String str)
	{
		if(null == str|| "".equals(str))
		{
			return true;
		}
		return false;
	}
	
	public static boolean isTheSameStr(String str1,String str2)
	{
		if(isStringEmpty(str1) || isStringEmpty(str2)||!str1.equals(str2))
		{
			return false;
		}
		return true;
	}
}
