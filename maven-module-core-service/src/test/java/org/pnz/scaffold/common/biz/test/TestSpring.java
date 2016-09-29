package org.pnz.scaffold.common.biz.test;

import maven.module.demo.AccountBase;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/** 
 * ClassName: TestSpring <br/> 
 * Function: TODO ADD FUNCTION. <br/> 
 * 
 * @author Paulsen��Zou 
 * @version  
 * @Date:2016��7��2������11:50:38 
 * @version V1.0
 */
public class TestSpring {
	private final static  Logger logger = LoggerFactory.getLogger(Test.class);

	/**
	 * main(������һ�仰�����������������)</p>
	 *
	 * @param args    �趨�ļ�
	 * @return void    ��������
	 * @throws
	 */
	public static void main(String[] args) {
		System.out.println(Thread.currentThread().getContextClassLoader ().getResource(""));
		@SuppressWarnings("resource")
		ApplicationContext ctx = new ClassPathXmlApplicationContext("classpath*:config/applicationContext.xml");
		AccountBase accoutBase = (AccountBase)ctx.getBean("demoBean");
		accoutBase.showMoney();
	}

}