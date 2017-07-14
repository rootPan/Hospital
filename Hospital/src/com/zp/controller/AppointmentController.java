package com.zp.controller;

import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zp.entity.Mediciner;
import com.zp.service.AppointmentService;
import com.zp.service.MedicinerSerivce;

@Controller
public class AppointmentController {
	@Autowired
	private MedicinerSerivce medicinerSerivce;
	@Autowired
	private AppointmentService appointmentService;
	@RequestMapping("/visit")
	public String visit(Integer mid,String time,Model model){
		Mediciner mediciner=medicinerSerivce.sel_docu(mid);
		GregorianCalendar g=new GregorianCalendar();
        int date=(int)g.get(Calendar.YEAR);
		model.addAttribute("time", date+"-"+time);
		model.addAttribute("mediciner", mediciner);
		return "appointment_form.jsp";
	}
	@RequestMapping("/addApp")
	public String addApp(@RequestParam String time,
			@RequestParam Integer mid,
			@RequestParam Integer uid,
			@RequestParam String patientName,
			Model model) throws IOException{
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("time", time);
		map.put("mid", mid);
		map.put("patientName", patientName);
		map.put("uid", uid);
		appointmentService.procInsertAppoint(map);
		int flag = (Integer)map.get("flag");
		if (flag==1) {
			return "allHospital";
		}
		return "allHospital";
	}
}
