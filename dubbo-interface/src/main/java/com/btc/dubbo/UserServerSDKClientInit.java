package com.btc.dubbo;

import com.alibaba.dubbo.config.ApplicationConfig;
import com.alibaba.dubbo.config.ConsumerConfig;
import com.alibaba.dubbo.config.MonitorConfig;
import com.alibaba.dubbo.config.ReferenceConfig;
import com.alibaba.dubbo.config.RegistryConfig;
import com.btc.dubbo.service.UserService;

/**
 * 客户端初始化sdk
 */
public class UserServerSDKClientInit {

	/**
	 * 用户服务sdk初始化
	 *
	 * @param applicationName
	 * @param zkUrl
	 * @return
	 */
	public static UserService init(String applicationName, String zkUrl){
		//应用名称
		ApplicationConfig applicationConfig = new ApplicationConfig();
		applicationConfig.setName(applicationName);

		//注册中心配置
		RegistryConfig registryConfig = new RegistryConfig();
		registryConfig.setProtocol("zookeeper");
		registryConfig.setAddress(zkUrl);

		//监控中心
		MonitorConfig monitorConfig = new MonitorConfig();
		monitorConfig.setProtocol("registry");

		//消费方属性设置
		ConsumerConfig consumerConfig = new ConsumerConfig();
		consumerConfig.setCheck(false);

		// 注意：ReferenceConfig为重对象，内部封装了与注册中心的连接，以及与服务提供方的连接

		// 引用远程服务
		// 此实例很重，封装了与注册中心的连接以及与提供者的连接，请自行缓存，否则可能造成内存和连接泄漏
		ReferenceConfig<UserService> reference = new ReferenceConfig<>();
		reference.setApplication(applicationConfig);
		reference.setRegistry(registryConfig);
		reference.setInterface(UserService.class);
		reference.setGroup("userService");
		//reference.setVersion("1.0.0");

		// 此代理对象内部封装了所有通讯细节，对象较重，请缓存复用
		return reference.get();

	}
}
