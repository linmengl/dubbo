package com.btc.dubbo.controller;

import com.btc.dubbo.service.UserService;
import com.btc.dubbo.bean.UserAddress;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserAddressController {

	@Autowired
	private UserService userService;

	@RequestMapping(value = "/userAddress/get/{userId}", method = RequestMethod.GET)
	public List<UserAddress> get(@PathVariable String userId) {
		return userService.getUserAddressList(userId);
	}
}
