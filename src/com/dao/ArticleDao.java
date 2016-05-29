package com.dao;

import java.util.List;

import com.entity.Article;
import com.util.Page;
import com.util.PageInfo;

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
