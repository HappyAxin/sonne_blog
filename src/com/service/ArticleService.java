package com.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import com.entity.Article;
import com.util.Page;
import com.util.PageInfo;
import com.util.Principal;

/**
 * @author ����
 * @date 2016.04.21
 * @description:����service�ӿ�
 */
public interface ArticleService extends BaseService<Article>
{
	public List<Article> findAllArticle();
	
	/*
	 * ����article�ô洢��·��
	 */
	public String getArticleUrl(Article article,HttpServletRequest request,
			                                         Principal userPrincipal);
	
	/*
	 * �����û�����������
	 */
	public Page<Article> getArticlesByUsername(String username,PageInfo pageInfo);
}
