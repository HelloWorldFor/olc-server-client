package com.ztesoft.bsn.dubbo.recharge.consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.ztesoft.bsn.dubbo.entity.DubboResponse;
import com.ztesoft.bsn.dubbo.recharge.entity.RechargeRequestDto;
import com.ztesoft.bsn.dubbo.recharge.service.RechargeService;

/**
 * 
 * @ClassName: RechargeConsumer 
 * @Description: 充值接口consumer 
 * @author lindong
 * @date 2016年8月30日 下午4:42:45 
 *
 */
@Component
public class RechargeConsumer {
	
	@Autowired
	RechargeService recharge;
	
	public String recharge(String rechargeRequest){
		RechargeRequestDto rechargeRuestDto = new RechargeRequestDto();
		rechargeRuestDto.setAccNbr("111111");
		rechargeRuestDto.setAmount(22222);
		DubboResponse resp = recharge.recharge(rechargeRuestDto);
		return resp.getJsonObject();
	}

}
