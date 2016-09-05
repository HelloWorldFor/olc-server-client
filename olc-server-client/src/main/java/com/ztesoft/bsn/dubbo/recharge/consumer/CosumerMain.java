package com.ztesoft.bsn.dubbo.recharge.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

import com.ztesoft.bsn.dubbo.demo.service.DemoService;
import com.ztesoft.bsn.dubbo.entity.DubboResponse;
import com.ztesoft.bsn.dubbo.recharge.entity.RechargeRequestDto;
import com.ztesoft.bsn.dubbo.recharge.service.RechargeService;

@Component
public class CosumerMain {
	
	@Autowired
	RechargeConsumer rechargeConsumer;
	
	public void test(){
		rechargeConsumer.recharge("dd");
	};

	public static void main(String[] args) {
		
		String[] fileUrl = new String[]{"classpath*:/config/spring-content.xml"};    
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext(fileUrl); 
		applicationContext.start();
 
		RechargeService rechargeConsumerService = (RechargeService)applicationContext.getBean("rechargeService"); 
        RechargeRequestDto rechargeRequestDto = new RechargeRequestDto();
        rechargeRequestDto.setAccNbr("13665075020");
        rechargeRequestDto.setAmount(10000);
        rechargeRequestDto.setRechargeDate("20160830184201");
        DubboResponse hello =  rechargeConsumerService.recharge(rechargeRequestDto);
 
        System.out.println( hello ); 
        
        CosumerMain consumerMain = applicationContext.getBean(CosumerMain.class);
        consumerMain.test();

        DemoService demoService = applicationContext.getBean(DemoService.class);
        System.out.println(demoService.sayHello("卧槽，监控啊"));
	}

}
