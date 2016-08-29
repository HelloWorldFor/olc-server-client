package com.ztesoft.consumer.demo.action;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ztesoft.bsn.dubbo.demo.service.DemoService;

public class ConsumerDemo {

	public static void main(String[] args) {
		String[] fileUrl = new String[]{"classpath*:/config/spring-content.xml"};    
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(fileUrl); 
		applicationContext.start();
 
        DemoService demoService = (DemoService)applicationContext.getBean("demoService"); 
        String hello = demoService.sayHello("world"); 
 
        System.out.println( hello ); 

	}

}
