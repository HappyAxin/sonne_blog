package sonn.dao;

import java.util.List;

import javax.persistence.criteria.CriteriaQuery;

import sonn.Order;
import sonn.util.Page;
import sonn.util.PageInfo;


/**
 * @author sonne
 * @date 2016.04.22
 * @description:dao base class
 *             2016-11-27 order
 */
public interface BaseDao<T>
{
	/**
	 * @Title: findList 
	* @Description: ��ѯ���У���List��ʽ����
	* @param @param clazz
	* @param @return    �趨�ļ� 
	* @return List<T>    �������� 
	* @throws
	 */
	List<T> findList(Class<T> clazz, List<Order> orders);
	/**
	 * ����ʵ������ҳ
	 * 
	 * @param pageable
	 *            ��ҳ��Ϣ
	 * @return ʵ������ҳ
	 */
	Page<T> findPage(PageInfo pageInfo,Class<T> clazz, List<Order> orders);
	
	public Page<T> findPage(CriteriaQuery<T> criteriaQuery,PageInfo pageInfo,
			Class<T> clazz, List<Order> orders); 
	
	/**
	 * �־û�ʵ�����
	 * 
	 * @param entity
	 *            ʵ�����
	 */
	void persist(T entity);
	
	/**
	 * �ϲ�ʵ�����
	 * 
	 * @param entity
	 *            ʵ�����
	 * @return ʵ�����
	 */
	T merge(T entity);
	
	/**
	 * ����ʵ�����
	 * 
	 * @param id
	 *            ID
	 * @return ʵ��������������򷵻�null
	 */
	T find(Integer id,Class<T> clazz);

	/**
	 * �Ƴ�ʵ�����
	 * 
	 * @param entity
	 *            ʵ�����
	 */
	void remove(T entity);
}
