package com.zp.controller;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.zp.entity.DateInfo;
import com.zp.entity.Dept;
import com.zp.entity.Mediciner;
import com.zp.service.DeptService;
import com.zp.service.MedicinerSerivce;

@Controller
public class MedicinerController {
	@Autowired
	private MedicinerSerivce medicinerSerivce=null;
	@Autowired
	private DeptService deptSerivce=null;
	@RequestMapping("/selMediciners")
	public String selMediciners(String obj,Model model){
		List<Mediciner> mediciners=medicinerSerivce.selMediciners(obj);
		List<Mediciner> med=medicinerSerivce.allTitle();
		List<Dept> depts=deptSerivce.getDeptOne();
		model.addAttribute("med", med);
		int count=mediciners.size();
		model.addAttribute("count", count);
		model.addAttribute("depts", depts);
		model.addAttribute("mediciners", mediciners);
		return "doctor_list.jsp";
	}
	@RequestMapping("/selMed")
	public String selMed(String title,Model model){
		List<Mediciner> mediciners=medicinerSerivce.selMed(title);
		List<Mediciner> med=medicinerSerivce.allTitle();
		List<Dept> depts=deptSerivce.getDeptOne();
		model.addAttribute("med", med);
		model.addAttribute("depts", depts);
		model.addAttribute("mediciners", mediciners);
		return "doctor_list.jsp";
	}
	@RequestMapping("/selDouc")
	public String selDouc(Integer mid,Model model){
		Mediciner mediciner=medicinerSerivce.sel_docu(mid);
		String dates=mediciner.getSurgeryweekday();
		Date date=new Date();
		List<DateInfo> dateInfos=new ArrayList<DateInfo>();
		Calendar a=Calendar.getInstance();
		int month=date.getMonth()+1;
		int week=date.getDay()+1;
		String weeks=null;
		int day=date.getDate()+1;
		int year=a.get(Calendar.YEAR);
		for (int i = 0; i < 7; i++) {
			DateInfo dateInfo=new DateInfo();
			if (month==2) {
				if ((year%100==0)&&(year%400==0)||(year%100!=0)&&(year%4==0)) {
					if (day==29) {
						day=0;
						month++;
					}
				}else {
					if (day==28) {
						day=0;
						month++;
					}
				}
			}else if (month==4||month==6||month==9||month==11) {
				if (day>30) {
					day=0;
					month++;
				}
			}else{
				if (day>31) {
					day=0;
					month++;
				}
			}
			switch (week) {
			case 1:
				weeks="星期一";
				break;
			case 2:
				weeks="星期二";
				break;
			case 3:
				weeks="星期三";
				break;
			case 4:
				weeks="星期四";
				break;
			case 5:
				weeks="星期五";
				break;
			case 6:
				weeks="星期六";
				break;
			default:
				weeks="星期天";
				break;
			}
			dateInfo.setDay(day);
			dateInfo.setMonth(month);
			dateInfo.setWeek(weeks);
			dateInfos.add(dateInfo);
			String[] times=mediciner.getSurgeryweekday().split(",");
			for (String string : times) {
				if (string.startsWith(weeks)) {
					String type=string.substring(3);
					if (type.equals("上午")) {
						dateInfo.setSw(1);
						dateInfo.setTime("上午");
					}else if (type.equals("下午")) {
						dateInfo.setXw(1);
						dateInfo.setTime("下午");
					}else {
						dateInfo.setWs(1);
						dateInfo.setTime("晚上");
					}
				}
			}
			week++;
			if (week>7) {
				week=1;
			}
			day++;
			
		}
		model.addAttribute("mediciner", mediciner);
		model.addAttribute("list", dateInfos);
		return "doctor_detail.jsp";
	}
}
