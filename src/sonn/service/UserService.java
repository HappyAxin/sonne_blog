package sonn.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import sonn.entity.User;


/**
* @ClassName: UserService 
* @Description: User service�ӿ�
* @author ����
* @date 2016-3-25 
*        2016-11-27  check passwd's complexity
*        2016-12-4 getUsernameFromSession
* @version 1.0
 */
public interface UserService extends BaseService<User>
{
	/**
	 *@Title: findByUserName 
	* @Description: �����û�����ѯ
	* @param @param username
	* @param @return    �趨�ļ� 
	* @return List<User>    �������� 
	* @throws
	 */
	public List<User> findByUserName(String username);
	
    public boolean validPwd(String pwd);
    
    public String getUsernameFromSession(HttpServletRequest request);
}
