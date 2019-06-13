package com.zzq.core;

import com.zzq.core.configuration.GenericConfiguration;
import com.zzq.core.entity.MyTestBean;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class BootStrap {
	
	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext( "spring-base.xml");

		String [] beanNames = context.getBeanDefinitionNames();
		for (int i = 0; i < beanNames.length; i++) {
			System.out.println("已注册的bean: " +beanNames[i] );
		}
		System.out.println(context.getBean("myTestBean") +  "--" + ((MyTestBean)context.getBean("myTestBean")).getName() + " GenericConfiguration: " + context.getBean(GenericConfiguration.class));
	}

}
