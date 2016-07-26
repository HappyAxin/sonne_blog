package sonn.dao;

import java.util.List;

import sonn.entity.Article;
import sonn.util.Page;
import sonn.util.PageInfo;


/**
 * @author ����
 * @date 2016.04.21 
 * @description:����dao�ӿ�
 */
public interface ArticleDao extends BaseDao<Article>
{
	public List<Article> findAllArticles();
	
	/*
	 * �����û�����������
	 */
	public Page<Article> getArticlesByUsername(String username,PageInfo pageInfo);
}
