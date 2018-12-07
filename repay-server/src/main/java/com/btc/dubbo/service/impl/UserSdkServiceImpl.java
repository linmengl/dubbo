package com.btc.dubbo.service.impl;

import com.btc.dubbo.UserServerSDKClientInit;
import com.btc.dubbo.service.UserSdkService;
import com.btc.dubbo.service.UserService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;

@Service
public class UserSdkServiceImpl implements UserSdkService{

	private UserService userService;

	@Value("${zookeeper.url}")
	private String zkUrl;

	@Value("${application.name}")
	private String applicationName;

	@Override
	public UserService getUserService() {
		if (userService == null){
			synchronized (UserSdkServiceImpl.class){
				if (userService == null){
					initUserService();
				}
			}
		}
		return userService;
	}

	@PostConstruct
	public void initUserService() {
		if (userService == null){
			synchronized (UserSdkServiceImpl.class){
				if (userService == null){
					userService = UserServerSDKClientInit.init(applicationName,zkUrl);
				}
			}
		}

	}
}
