package com.springboot.EMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.EMS.model.Job;
import com.springboot.EMS.model.JobSeeker;
import com.springboot.EMS.service.JobSeekerService;
import com.springboot.EMS.service.JobService;

@RestController
public class JobSeekerController {

	@Autowired
	private JobSeekerService jobSeekerService;

	@Autowired
	private JobService jobService;

	@PostMapping("/job-seeker/batch/addjobseeker")
	public List<JobSeeker> insertInBatch(@RequestBody List<JobSeeker> list) {
		return jobSeekerService.insertInBatch(list);
	}

	@GetMapping("/job-seeker/all")
	public List<JobSeeker> getAllJobSeeker() {
		List<JobSeeker> jobSeeker = jobSeekerService.getAllJobSeeker();
		return jobSeeker;
	}

	@GetMapping("/jobs")
	public List<Job> getJobsByRole(@RequestParam("role") String roleName) {
		return jobService.getJobsByRole(roleName);
	}
}
