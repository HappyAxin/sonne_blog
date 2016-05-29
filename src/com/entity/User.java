package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
* @ClassName: User 
* @Description: Userʵ����
* @author ����
* @date 2016-3-25 2016-5-1����������ɲ���
* @version 1.0
 */
@Entity
public class User
{
	/*id*/
	private int id;
	
	/*�û���*/
	private String username;
	
	/*����*/
	private String password;
	
	/* "�����Ϣ"�������� */
	public static final String PRINCIPAL_ATTRIBUTE_NAME 
	                       = User.class.getName() + ".PRINCIPAL";
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY) 
	public int getId() 
	{
		return id;
	}
	
	public void setId(int id)
	{
		this.id = id;
	}
	
	public String getUsername() 
	{
		return username;
	}
	
	public void setUsername(String username)
	{
		this.username = username;
	}
	
	public String getPassword()
	{
		return password;
	}
	
	public void setPassword(String password) 
	{
		this.password = password;
	}
}
