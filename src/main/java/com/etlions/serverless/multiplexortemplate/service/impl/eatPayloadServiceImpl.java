package com.etlions.serverless.multiplexortemplate.service.impl;

import com.etlions.serverless.multiplexortemplate.service.eatPayloadService;

public class eatPayloadServiceImpl implements eatPayloadService{

	@Override
	public void eatPayload(String input) {
		System.out.print(input);		
	}

}
