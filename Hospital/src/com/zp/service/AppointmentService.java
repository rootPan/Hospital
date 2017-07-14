package com.zp.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.zp.entity.Appointment;
import com.zp.mapper.AppointmentMapper;

@Service
public class AppointmentService {
	@Autowired
	private AppointmentMapper appointmentMapper;
	
	public void procInsertAppoint(Map<String, Object> map){
		appointmentMapper.pro_set(map);
	}
	
	public List<Appointment> selAllApp(){
		return appointmentMapper.selectByExample(null);
	}
}
