package com.btc.dubbo.config;

import com.alibaba.dubbo.config.MethodConfig;
import com.alibaba.dubbo.config.ServiceConfig;
import com.btc.dubbo.service.UserService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
public class DubboConfig {

	//@Bean
	//public ServiceConfig<UserService> serviceConfig(UserService userService) {
	//	ServiceConfig<UserService> serviceConfig = new ServiceConfig<>();
	//	serviceConfig.setInterface(UserService.class);
	//	serviceConfig.setRef(userService);
	//
	//	MethodConfig methodConfig = new MethodConfig();
	//	methodConfig.setTimeout(2000);
	//	methodConfig.setRetries(2);
	//
	//	List<MethodConfig> methodConfigs = new ArrayList<>();
	//	methodConfigs.add(methodConfig);
	//	serviceConfig.setMethods(methodConfigs);
	//
	//	return serviceConfig;
	//
	//}

}
