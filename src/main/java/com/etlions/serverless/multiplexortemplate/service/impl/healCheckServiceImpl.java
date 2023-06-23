package com.etlions.serverless.multiplexortemplate.service.impl;

import org.springframework.stereotype.Service;

import com.etlions.serverless.multiplexortemplate.service.healthCheckService;
import com.etlions.serverless.multiplexortemplate.utils.ApiResponse;

@Service
public class healCheckServiceImpl implements healthCheckService{

	@Override
	public ApiResponse healthCheck() {
		return ApiResponse.ok("healthcheck", "yellow from Multiplexor");
	}

}
