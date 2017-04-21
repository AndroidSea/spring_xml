package com.spring.text;

import java.util.List;

import org.junit.Test;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.spring.action.UserAction;
import com.spring.model.HelloWorld;
import com.spring.model.User;

public class Text {
		
		BeanFactory factory=new ClassPathXmlApplicationContext("beans.xml");
	@Test
	public void test() {
		// 创建出来 BeanFactory
				factory.getBean("hello", HelloWorld.class).sayHello();
	}
	
	
	@Test
	public void text01(){
		User u=new User(2,"小小孩");
		UserAction action=	factory.getBean("action", UserAction.class);
		action.setUserModel(u);
		action.addUser();
		action.delete();
		action.load();
		
		User us=new User(6,"大大胖子");
		action.setUserModel(us);
		action.addUser();
		action.delete();
		action.load();
	}
	
	@Test
	public void textlist(){
		//基于xml 注入list的
		UserAction action=factory.getBean("action",UserAction.class);
		List<String> list=action.getStrList();
		for(String s:list){
			System.out.println(s);
		}
		
	}

}
