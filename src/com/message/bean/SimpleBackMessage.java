package com.message.bean;

/**
* @ClassName: SimpleBackMessage 
* @Description: ��򵥵ķ������ص�bean
* @author ����
* @date 2016-5-1 ����9:02:53 2016.05.02RegisterMessage��ΪSimpleBackMessage
* @version 1.0
 */
public class SimpleBackMessage
{
	
	public SimpleBackMessage()
	{
		this.isSuccess = true;
	}
	
	/*�Ƿ�ע��ɹ�*/
	private boolean isSuccess;
	
	/*���ص���ʾ*/
	private String returnMessage;

	public boolean isSuccess() 
	{
		return isSuccess;
	}

	public void setSuccess(boolean isSuccess)
	{
		this.isSuccess = isSuccess;
	}

	public String getReturnMessage()
	{
		return returnMessage;
	}

	public void setReturnMessage(String returnMessage) 
	{
		this.returnMessage = returnMessage;
	}
	
}
