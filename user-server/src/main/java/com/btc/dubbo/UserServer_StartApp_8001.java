package com.btc.dubbo;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubbo
public class UserServer_StartApp_8001 {
	public static void main(String[] args) {
		SpringApplication.run(UserServer_StartApp_8001.class,args);
	}
}
