package com.fckeditor;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import net.fckeditor.requestcycle.UserPathBuilder;

/**
* @ClassName: MyUserPath 
* @Description: ����fckeditor user·��
* @author ����
* @date 2016-5-15 ����12:10:56 
* @version 1.0
 */
public class MyUserPath implements UserPathBuilder
{

	public String getUserFilesPath(HttpServletRequest request) 
	{
		//����һ��·�������·�������û���Ŀ¼
		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		return "/userfiles/" + username;
	}

}
