package com.zz.application.consumer.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean
{

	@Bean
	@LoadBalanced//ribbon基于NETFLIX RIBBON实现的一套 "客户端" 负载均衡工具
	public RestTemplate restTemplate()
	{
		return new RestTemplate();
	}
}
