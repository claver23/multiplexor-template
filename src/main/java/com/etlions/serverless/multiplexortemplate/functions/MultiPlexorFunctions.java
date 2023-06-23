package com.etlions.serverless.multiplexortemplate.functions;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.etlions.serverless.multiplexortemplate.utils.ApiResponse;

@Configuration
public class MultiPlexorFunctions {
	
	@Bean
	Supplier<ApiResponse> healthCheck(){
		return () -> ApiResponse.ok("healthcheck", "yellow from Multiplexor") ;
	}
	
	@Bean
	Function<String, ApiResponse> toUpperCase(){
		return (input) -> ApiResponse.ok("toUpperCase", input.toUpperCase() + "from Multiplexor");  
	}
	
	@Bean
	Consumer<String> eatPayload(){
		return (input) -> System.out.println(input);
	}

}
