package sonn.dao;

import java.util.List;

import sonn.Order;
import sonn.entity.Article;
import sonn.util.Page;
import sonn.util.PageInfo;


/**
 * @author ����
 * @date 2016.04.21 
 *       2017-02-02 articles'order(sorting) setting.
 * @description:����dao�ӿ�
 */
public interface ArticleDao extends BaseDao<Article>
{
	public List<Article> findAllArticles();
	
	/*
	 * �����û�����������
	 */
	public Page<Article> getArticlesByUsername(String username,PageInfo pageInfo);

	Page<Article> getArticlesByUsername(String username, PageInfo pageInfo,
			List<Order> orders);
}
