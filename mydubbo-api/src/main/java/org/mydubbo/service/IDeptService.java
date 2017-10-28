package org.mydubbo.service;

import java.util.List;

import org.mydubbo.vo.Dept;


public interface IDeptService {
	public boolean add(Dept dept) ;
	public Dept get(long deptno) ;
	public List<Dept> list() ; 
}
