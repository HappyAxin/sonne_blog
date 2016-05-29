package com.dao;

import java.util.List;

import com.util.Page;
import com.util.PageInfo;

/**
 * @author ����
 * @date 2016.04.22
 * @description:dao����
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
	List<T> findList(Class<T> clazz);
	/**
	 * ����ʵ������ҳ
	 * 
	 * @param pageable
	 *            ��ҳ��Ϣ
	 * @return ʵ������ҳ
	 */
	Page<T> findPage(PageInfo pageInfo,Class<T> clazz);
	
	/**
	 * �־û�ʵ�����
	 * 
	 * @param entity
	 *            ʵ�����
	 */
	void persist(T entity);
}
