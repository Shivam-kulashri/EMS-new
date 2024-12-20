package com.springboot.EMS.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.EMS.model.Hr;
import com.springboot.EMS.service.HrService;

@RestController
public class HrController {

	@Autowired
	private HrService hrService;

	@PostMapping("/hr/batch/addhr")
	public List<Hr> addHrBatch(@RequestBody List<Hr> list) {
		return hrService.insertInBatch(list);
	}

	@GetMapping("/hr/all")
	public List<Hr> getAllHr() {
		List<Hr> hr = hrService.getAllHr();
		return hr;
	}
}
