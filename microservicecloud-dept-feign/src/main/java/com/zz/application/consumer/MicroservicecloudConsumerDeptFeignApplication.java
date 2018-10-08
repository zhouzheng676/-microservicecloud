package com.zz.application.consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages ={"com.zz.service"})
//说明：在添加注解@EnableFeignClients(basePackages= {"cn.edu.microservicecloudapi.service"})，否则@Autowired注入失败，
//basePackages 为 DeptClientService类 所在的包，
public class MicroservicecloudConsumerDeptFeignApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(MicroservicecloudConsumerDeptFeignApplication.class, args);
	}
}
