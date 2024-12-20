package com.springboot.EMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.EMS.model.InterviewSchedular;
import com.springboot.EMS.service.InterviewSchedularService;

@RestController
public class InterviewSchedularController {

	@Autowired
	private InterviewSchedularService interviewSchedularService;

	@PostMapping("/InterviewSchedular/add")
	public InterviewSchedular ScheduleInterview(@RequestBody InterviewSchedular interviewSchedular) {
		// System.out.println(policy);
		return interviewSchedularService.insert(interviewSchedular);
	}

	@PostMapping("/InterviewSchedular/batch/addInterviewSchedule")
	public List<InterviewSchedular> addInterviewScheduleBatch(@RequestBody List<InterviewSchedular> list) {
		return interviewSchedularService.insertInBatch(list);
	}

	@GetMapping("/interviewschedular/all")
	public List<InterviewSchedular> getAllInterviews() {
		List<InterviewSchedular> interviews = interviewSchedularService.getAllInterview();
		return interviews;
	}

}
