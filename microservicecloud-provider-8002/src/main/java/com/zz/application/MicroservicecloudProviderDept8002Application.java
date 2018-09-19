package com.zz.application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //服務啓動后，會自動注冊到eureka
public class MicroservicecloudProviderDept8002Application
{

	public static void main(String[] args)
	{
		SpringApplication.run(MicroservicecloudProviderDept8002Application.class, args);
	}
}
