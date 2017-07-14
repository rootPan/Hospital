package com.zp.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.zp.entity.Appointment;
import com.zp.entity.Dept;
import com.zp.entity.Hospital;
import com.zp.entity.Mediciner;
import com.zp.service.AppointmentService;
import com.zp.service.DeptService;
import com.zp.service.HospitalService;
import com.zp.service.MedicinerSerivce;

@Controller
public class HospitalController {
	@Autowired
	private HospitalService hospitalService=null;
	@Autowired
	private MedicinerSerivce medicinerSerivce=null;
	@Autowired
	private DeptService deptSerivce=null;
	@Autowired
	private AppointmentService appointmentService=null;
	@RequestMapping("/selHosp")
	public String selHosp(Hospital hospital,Model model){
			List<Hospital> hospitals=hospitalService.sel_hosp(hospital.getHname());
			System.out.println(hospital.getHname());
			int count=medicinerSerivce.selCount(hospital.getHname()).size();
			model.addAttribute("hospitals", hospitals);
			model.addAttribute("count", count-1);
			return "hospital_list.jsp";
	}
	@RequestMapping("/sel_Hospitalsg")
	public String sel_Hospitalsg(String grade,Model model){
		List<Hospital> hospitals=hospitalService.sel_Hospital(grade);
		model.addAttribute("hospitals", hospitals);
		model.addAttribute("count", hospitals.size());
		return "hospital_list.jsp";
	}
	@RequestMapping("/allHospital")
	public String allHospital(Model model){
		List<Hospital> hospitals=hospitalService.allHospital(null);
		List<Mediciner> mediciners=medicinerSerivce.selMediciners("");
		List<Dept> depts=deptSerivce.getFirstDept();
		List<Appointment> appointments=appointmentService.selAllApp();
		for (Hospital hosp : hospitals) {
			String count=String.valueOf(hospitalService.selTuijian(hosp.getHname()));
			hosp.setCount(count);
		}
		Map<String,List<Dept>> maps=deptSerivce.getDeptTwo();
		model.addAttribute("deptMaps", maps);
		model.addAttribute("count", hospitals.size());
		model.addAttribute("count1", mediciners.size());
		model.addAttribute("count2", appointments.size());
		model.addAttribute("hospitals", hospitals);
		model.addAttribute("mediciners", mediciners);
		model.addAttribute("depts", depts);
		return "index.jsp";
	}
	@RequestMapping("/selHname")
	public String selHname(@RequestParam String hname,Model model){
		Hospital hospital=hospitalService.sel_Hname(hname);
		List<Dept> depts=deptSerivce.getDeptOne();
		List<Mediciner> med=medicinerSerivce.selCount(hname);
		List<Mediciner> mediciners=medicinerSerivce.allTitle();
		model.addAttribute("med", med);
		model.addAttribute("count", med.size());
		model.addAttribute("mediciners", mediciners);
		model.addAttribute("hospital", hospital);
		model.addAttribute("depts", depts);
		return "hospital_detail.jsp";
	}
}
