package sonn.util;

/**
 * @author ����
 * @date 2016.04.21-2016.04.24 
 * @description:��ҳ
 */
public class PageInfo 
{	
	public static final int DEFAULT_EVERYOAGE = 6;
	
	public static final int DEFAULT_CURRENTPAGE = 1;
	
	/**ÿҳ��ʾ����*/
	private int everyPage;
	
	/**�ܼ�¼��*/
	private long totalCount;
	
	/**��ҳ��*/
	private long totalPage;
	
	/**��ǰҳ*/
	private int currentPage;
	
	/**��ʼ��*/
	private int beginIndex;
	
	/**�Ƿ�����һҳ*/
	private boolean hasPrePage;
	
	/**�Ƿ�����һҳ*/
	private boolean hasNextPage;

	public PageInfo(int everyPage, long total, long totalPage, int currentPage,
			int beginIndex, boolean hasPrePage, boolean hasNextPage)
	{
		this.everyPage = everyPage;
		this.totalCount = total;
		this.totalPage = totalPage;
		this.currentPage = currentPage;
		this.beginIndex = beginIndex;
		this.hasPrePage = hasPrePage;
		this.hasNextPage = hasNextPage;
	}

	//���캯����Ĭ��
	public PageInfo()
	{
	}
	
	public PageInfo(int currentPage, int everyPage) 
	{
		this.everyPage = everyPage;
	}
	
	//���췽�������������Խ�������
	public int getEveryPage() 
	{
		return everyPage;
	}

	public void setEveryPage(int everyPage) 
	{
		this.everyPage = everyPage;
	}

	public long getTotalCount() 
	{
		return totalCount;
	}

	public void setTotalCount(long totalCount)
	{
		this.totalCount = totalCount;
	}

	public long getTotalPage()
	{
		return totalPage;
	}

	public void setTotalPage(long totalPage) 
	{
		this.totalPage = totalPage;
	}

	public int getCurrentPage()
	{
		return currentPage;
	}

	public void setCurrentPage(int currentPage)
	{
		this.currentPage = currentPage;
	}

	public int getBeginIndex()
	{
		return beginIndex;
	}

	public void setBeginIndex(int beginIndex)
	{
		this.beginIndex = beginIndex;
	}

	public boolean isHasPrePage() 
	{
		return hasPrePage;
	}

	public void setHasPrePage(boolean hasPrePage)
	{
		this.hasPrePage = hasPrePage;
	}

	public boolean isHasNextPage() 
	{
		return hasNextPage;
	}

	public void setHasNextPage(boolean hasNextPage)
	{
		this.hasNextPage = hasNextPage;
	}

}

