package com.zp.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zp.entity.Dept;
import com.zp.entity.DeptExample;
import com.zp.mapper.DeptMapper;

@Service
public class DeptService {
	@Autowired
	private DeptMapper deptMapper;
	public List<Dept> getFirstDept(){
		return deptMapper.getFirstDept();
	}
	public List<Dept> getDeptOne(){
		DeptExample example=new DeptExample();
		example.createCriteria().andPdidIsNull();
		return deptMapper.selectByExample(example);
	}
	//二级科室
	public Map<String, List<Dept>> getDeptTwo(){
		List<Dept> depts=deptMapper.getAll();
		Map<String, List<Dept>> map = new TreeMap<String, List<Dept>>();
		for (Dept dept : depts) {
			if(dept.getPdid() != null){
				continue;
			}
			String did = String.valueOf(dept.getDid());
			String name = dept.getDname();
			List<Dept> list = new ArrayList<Dept>();
			for (Dept d2 : depts) {
				if (String.valueOf(d2.getPdid()).equals(did)) {
					list.add(d2);
				}
			}
			map.put(name, list);
		}
		return map;
	}
}
