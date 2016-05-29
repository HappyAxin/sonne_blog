package com.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * @author ����
 * @date 2016.04.21  2016-5-1����������ɲ���
 *       2016-05-15�ı�洢user��username
 * @description:����ʵ����
 */
@Entity
public class Article 
{
	/*id*/
	private int id;
	
	/*����*/
	private String title;
	
	/*����·��*/
	private String articleAddr;
	
	/*��������*/
	private String content;
	
	/*����*/
//	private User author;
	
	private String authorName;
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getId()
	{
		return id;
	}
	
	public void setId(int id) 
	{
		this.id = id;
	}
	
	public String getTitle()
	{
		return title;
	}
	
	public void setTitle(String title) 
	{
		this.title = title;
	}
	
	public String getArticleAddr() {
		return articleAddr;
	}

	public void setArticleAddr(String articleAddr) {
		this.articleAddr = articleAddr;
	}

	public String getAuthorName()
	{
		return authorName;
	}

	public void setAuthorName(String authorName)
	{
		this.authorName = authorName;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}
	
}
