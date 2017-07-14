package com.zp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zp.entity.Mediciner;
import com.zp.entity.MedicinerExample;
import com.zp.mapper.MedicinerMapper;

@Service
public class MedicinerSerivce {
	@Autowired
	private MedicinerMapper medicinerMapper=null;
	public List<Mediciner> selCount(String hname){
		MedicinerExample example=new MedicinerExample();
		example.createCriteria().andHospitalEqualTo(hname);
		return medicinerMapper.selectByExample(example);
	}
	public List<Mediciner> selMed(String title){
		return medicinerMapper.selMed(title);
	}
	public List<Mediciner> selMediciners(String obj){
		return medicinerMapper.selMediciners(obj);
	}
	public List<Mediciner> allTitle() {
		return medicinerMapper.selAllTitle();
	}
	public Mediciner sel_docu(Integer mid){
		return medicinerMapper.sel_docu(mid);
	}
}
