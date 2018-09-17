package com.zz.entities;

import java.io.Serializable;

public class Dept implements Serializable// entity --orm--- db_table
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 7598873864807006261L;
	private String db_source;// 来自那个数据库，因为微服务架构可以一个服务对应一个数据库，同一个信息被存储到不同数据库
	private Long deptno; // 主键
	private String dname; // 部门名称

	public String getDb_source()
	{
		return db_source;
	}

	public Long getDeptno()
	{
		return deptno;
	}

	public String getDname()
	{
		return dname;
	}

	public void setDb_source(String db_source)
	{
		this.db_source = db_source;
	}

	public void setDeptno(Long deptno)
	{
		this.deptno = deptno;
	}

	public void setDname(String dname)
	{
		this.dname = dname;
	}

}
