package com.etlions.serverless.multiplexortemplate.service.impl;

import com.etlions.serverless.multiplexortemplate.service.toUpperCaseService;
import com.etlions.serverless.multiplexortemplate.utils.ApiResponse;

public class toUpperCaseServiceImpl implements toUpperCaseService{

	@Override
	public ApiResponse toUpperCase(String input) {
		// TODO Auto-generated method stub
		return ApiResponse.ok("toUpperCase", input.toUpperCase() + "from Multiplexor");
	}

}
