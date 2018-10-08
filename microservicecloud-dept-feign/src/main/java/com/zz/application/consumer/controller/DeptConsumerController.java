package com.zz.application.consumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.zz.entities.Dept;
import com.zz.service.DeptClientService;

@RestController
public class DeptConsumerController
{
	// private static final String REST_URL_PREFIX = "http://localhost:8001";
	// private static final String REST_URL_PREFIX = "http://MICROSERVICECLOUD-DEPT";
	@Autowired
	private DeptClientService service;

	/**
	 * 使用 使用restTemplate访问restful接口非常的简单粗暴无脑。 (url, requestMap,
	 * ResponseBean.class)这三个参数分别代表 REST请求地址、请求参数、HTTP响应转换被转换成的对象类型。
	 */
	//	@Autowired
	//	private RestTemplate restTemplate;

	@RequestMapping(value = "/consumer/dept/add")
	public boolean add(Dept dept)
	{
		return service.addDept(dept);
	}

	@RequestMapping(value = "/consumer/dept/get/{id}")
	public Dept get(@PathVariable("id") Long id)
	{
		return service.findById(id);
	}

	@RequestMapping(value = "/consumer/dept/list")
	public List<Dept> list()
	{
		return service.findAll();
	}
}
