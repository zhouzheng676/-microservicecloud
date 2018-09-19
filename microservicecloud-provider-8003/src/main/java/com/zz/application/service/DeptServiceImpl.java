package com.zz.application.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zz.application.dao.DeptDao;
import com.zz.entities.Dept;

@Service
public class DeptServiceImpl implements DeptService
{
	@Autowired
	private DeptDao dao;

	public boolean addDept(Dept dept)
	{
		return dao.addDept(dept);
	}

	public Dept findById(Long id)
	{
		return dao.findById(id);
	}

	public List<Dept> findAll()
	{
		return dao.findAll();
	}

}
