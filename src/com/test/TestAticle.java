package com.test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ����
 * @date 2016.04.21
 * @description:���²�����
 */
public class TestAticle 
{
	@Test
	public void testArticleFun()
	{
        String conf = "spring-common.xml";
        ApplicationContext ac = new ClassPathXmlApplicationContext(conf);
        System.out.println(ac);
	}
}
