package com.btc.dubbo.service;

import com.btc.dubbo.bean.UserAddress;

import java.util.List;

public interface UserService {
	/**
	 * 根据userId返回用户地址
	 *
	 * @param userId
	 * @return
	 */
	List<UserAddress> getUserAddressList(String userId);

	String getUserAddress(String userId);
}
