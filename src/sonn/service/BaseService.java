package sonn.service;

import java.util.List;

import sonn.Order;
import sonn.util.Page;
import sonn.util.PageInfo;


/**
* @ClassName: BaseService 
* @Description:Service���ӿ�
* @author sonne
* @date 2016-4-22
*       2016-11-27 order
*       2017-02-02 updates
* @version 1.0
* @param <T>
 */
public interface BaseService<T>
{
	/**
	 * ����ʵ������ҳ
	 * 
	 * @param pageable
	 *            ��ҳ��Ϣ
	 * @return ʵ������ҳ
	 */
	Page<T> findPage(PageInfo pageInfo,Class<T> clazz, List<Order> orders);
	
	/**
	 * @Title: findList 
	* @Description: ��ѯ���У���List��ʽ����
	* @param @param clazz
	* @param @return    �趨�ļ� 
	* @return List<T>    �������� 
	* @throws
	 */
	List<T> findList(Class<T> clazz,  List<Order> orders);
	
	/**
	 * ����ʵ�����
	 * 
	 * @param entity
	 *            ʵ�����
	 */
	void save(T entity);


	/**
	 * ����ʵ�����
	 * 
	 * @param entity
	 *            ʵ�����
	 * @return ʵ�����
	 */
	T update(T entity);
	
	/**
	 * ����ʵ����󼯺�
	 * 
	 * @param entities
	 *            ʵ����󼯺�
	 * @return ʵ����󼯺�
	 */
	List<T> updates(List<T> entities);
	
	/**
	* @Title: find 
	* @Description: ����id��ѯ
	* @param @param id
	* @param @return    �趨�ļ� 
	* @return T    �������� 
	* @throws
	 */
	T find(Integer id,Class<T> clazz);


	/**
	 * ɾ��ʵ�����
	 * 
	 * @param id
	 *            ID
	 */
	void delete(Integer id, Class<T> clazz);


	/**
	 * ɾ��ʵ�����
	 * 
	 * @param entity
	 *            ʵ�����
	 */
	void delete(T entity);

}
