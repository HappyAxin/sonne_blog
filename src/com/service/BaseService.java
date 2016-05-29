package com.service;

import java.util.List;

import com.util.Page;
import com.util.PageInfo;

/**
* @ClassName: BaseService 
* @Description:Service���ӿ�
* @author ����
* @date 2016-4-22
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
	Page<T> findPage(PageInfo pageInfo,Class<T> clazz);
	
	/**
	 * @Title: findList 
	* @Description: ��ѯ���У���List��ʽ����
	* @param @param clazz
	* @param @return    �趨�ļ� 
	* @return List<T>    �������� 
	* @throws
	 */
	List<T> findList(Class<T> clazz);
	
	/**
	 * ����ʵ�����
	 * 
	 * @param entity
	 *            ʵ�����
	 */
	void save(T entity);

}
