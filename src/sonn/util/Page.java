package sonn.util;

import java.util.ArrayList;
import java.util.List;

/**
 * @author ����
 * @date 2016.04.22
 * @description����ҳ��
 */
public class Page<T> 
{
	/** ���� */
	private List<T> content = new ArrayList<T>();
	
	/** �ܼ�¼�� */
	private final long total;
	
	/** ��ҳ��Ϣ */
	private final PageInfo pageInfo;
	
	/**
	 * ��ʼ��һ���´�����Page����
	 */
	public Page(List<T> content, long total, PageInfo pageInfo)
	{
		if (null != content)
		{
		    this.content.addAll(content);
		}
		this.total = total;
		this.pageInfo = pageInfo;
	}

	public List<T> getContent() 
	{
		return content;
	}
	
	public void setContent(List<T> list)
	{
		this.content = list;
	}

	public PageInfo getPageInfo() 
	{
		return pageInfo;
	}

	public long getTotal() 
	{
		return total;
	}
	
}
