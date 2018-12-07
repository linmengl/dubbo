package com.btc.dubbo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.btc.dubbo.bean.UserAddress;
import com.btc.dubbo.service.UserService;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

@Component("userService2")
@Service(loadbalance = "roundrobin",retries = 4,group = "userService2")
public class UserServiceImpl2 implements UserService {
	@Override
	public List<UserAddress> getUserAddressList(String userId) {
		System.out.println("UserServiceImpl.....22222..."+System.currentTimeMillis());
		UserAddress address1 = new UserAddress(1, "北京市通州区", "1", "老李", "010-56253825", "Y");
		UserAddress address2 = new UserAddress(2, "三亚西部", "1", "老王", "010-56253825", "N");
		try {
			Thread.sleep(4000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return Arrays.asList(address1, address2);
	}

	@Override
	public String getUserAddress(String userId) {
		return "haode";
	}
}
