package com.ztesoft.bsn.dubbo.recharge.service;

import com.ztesoft.bsn.dubbo.entity.DubboResponse;
import com.ztesoft.bsn.dubbo.recharge.entity.RechargeRequestDto;

/**
 * 
 * @author Administrator
 *	充值接口
 */
public interface RechargeService {
	
	public DubboResponse recharge(RechargeRequestDto rechargeQequestDto); 

}
