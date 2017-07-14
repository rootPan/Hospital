package com.zp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zp.entity.Hospital;
import com.zp.entity.HospitalExample;
import com.zp.mapper.HospitalMapper;
@Service
public class HospitalService {
	@Autowired
	private HospitalMapper hospitalMapper;
	public List<Hospital> sel_hosp(String hname){
		HospitalExample example=new HospitalExample();
		example.createCriteria().andHnameEqualTo(hname);
		return hospitalMapper.selectByExample(example);
	}
	public List<Hospital> sel_Hospital(String grade){
		return hospitalMapper.sel_Hospital(grade);
	}
	public List<Hospital> allHospital(String hname) {
		return hospitalMapper.allHospital(hname);
	}
	public Hospital sel_Hname(String hname){
		return hospitalMapper.sel_Hname(hname);
	}
	public int selTuijian(String hname){
		return hospitalMapper.selTuijian(hname);
	}
}
