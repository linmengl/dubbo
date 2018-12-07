package com.btc.dubbo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.btc.dubbo.bean.UserAddress;
import com.btc.dubbo.service.UserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class OrderController {

	@Reference(loadbalance = "roundrobin", group = "userService")
	private UserService userService;

	@RequestMapping(value = "/order/do/{userId}", method = RequestMethod.GET)
	public List<UserAddress> getOrder(@PathVariable String userId) {
		return userService.getUserAddressList(userId);
	}

}
