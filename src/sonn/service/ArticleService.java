package sonn.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import sonn.entity.Article;
import sonn.util.Page;
import sonn.util.PageInfo;
import sonn.util.Principal;


/**
 * @author ����
 * @date 2016.04.21
 *       2016-11-11 article summary
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
	 * get the url of summary
	 */
	public String getSummaryUrl(Article article, HttpServletRequest request, 
			                                        Principal userPrincipal);
	
	/*
	 * �����û�����������
	 */
	public Page<Article> getArticlesByUsername(String username,PageInfo pageInfo);
}
