package sonn.util;

/**
 * @author ����
 * @date 2016.04.21 2016-5-1final�ಢ���˽�й��캯��
 * @description:��ҳ��Ϣ������
 */
public final class PageUtils 
{
	
	private PageUtils(){}
	
	/**
	 * ����everyPage��total��currentPage������ҳ��Ϣ����
	 */
    public static PageInfo createPage(int everyPage,long total,int currentPage)
    {
        everyPage = getEveryPage(everyPage);
        currentPage = getCurrentPage(currentPage);
        long totalPage = getTotalPage(everyPage, total);
        int beginIndex = getBeginIndex(everyPage, currentPage);
        boolean hasPrePage = getHasPrePage(currentPage);
        boolean hasNextPage = getHasNextPage(totalPage, currentPage);
        return new PageInfo(everyPage, total, totalPage, currentPage,
                beginIndex, hasPrePage,  hasNextPage);
    }
    
	/**
	 * ����everyPage��total��currentPage���������ҳ��Ϣ����
	 */
    public static void setPageInfo(PageInfo pageInfo,int everyPage,long total,int currentPage)
    {
        everyPage = getEveryPage(everyPage);
        currentPage = getCurrentPage(currentPage);
        long totalPage = getTotalPage(everyPage, total);
        int beginIndex = getBeginIndex(everyPage, currentPage);
        boolean hasPrePage = getHasPrePage(currentPage);
        boolean hasNextPage = getHasNextPage(totalPage, currentPage);
        pageInfo.setEveryPage(everyPage);
        pageInfo.setCurrentPage(currentPage);
        pageInfo.setTotalPage(totalPage);
        pageInfo.setBeginIndex(beginIndex);
        pageInfo.setHasNextPage(hasNextPage);
        pageInfo.setHasPrePage(hasPrePage);
        pageInfo.setTotalCount(total);
    }
    
    /**
     * ���ÿҳ��ʾ��¼��
     */
    public static int getEveryPage(int everyPage)
    {        
        return everyPage == 0 ? 6: everyPage;
    }
    
    /**
     * ��õ�ǰҳ
     */
    public static int getCurrentPage(int currentPage)
    {    
        return currentPage == 0 ? 1 : currentPage;
    }
    
    /**
     * �����ҳ��
     */
    public static long getTotalPage(int everyPage,long total)
    {
        long totalPage = 0;
        if(total != 0 &&total % everyPage == 0)
        {
            totalPage = total / everyPage;
        }
        else 
        {
            totalPage = total / everyPage + 1;
        }
        return totalPage;
    }
    
    /**
     * �����ʼλ��
     */
    public static int getBeginIndex(int everyPage,int currentPage)
    {
        return (currentPage - 1) * everyPage;
    }
    
    /**
     * ����Ƿ�����һҳ
     */
    public static boolean getHasPrePage(int currentPage)
    {
        return currentPage == 1 ? false : true;
    }
    
    /**
     * ����Ƿ�����һҳ
     */
    public static boolean getHasNextPage(long totalPage, int currentPage) 
    {    
        return currentPage == totalPage || totalPage == 0 ? false : true;
    }
	
}
