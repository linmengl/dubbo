package com.btc.dubbo.controller;

import com.btc.dubbo.bean.UserAddress;
import com.btc.dubbo.service.UserSdkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class RepayController {

	@Autowired
	private UserSdkService userService;

	@RequestMapping(value = "/repay/do/{userId}",method = RequestMethod.GET)
	public List<UserAddress> getOrder(@PathVariable String userId){
		return userService.getUserService().getUserAddressList(userId);
	}

}
