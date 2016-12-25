package sonn.dao;

import java.util.List;

import sonn.entity.User;


/**
* @ClassName: UserDao 
* @Description: User dao interface
* @author sonne
* @date 2016-3-25
* @version 1.0
 */
public interface UserDao extends BaseDao<User>
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
}
