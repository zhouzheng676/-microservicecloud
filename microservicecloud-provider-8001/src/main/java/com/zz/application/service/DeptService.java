package com.zz.application.service;

import java.util.List;

import com.zz.entities.Dept;

public interface DeptService
{
	public boolean addDept(Dept dept);

	public Dept findById(Long id);

	public List<Dept> findAll();
}
