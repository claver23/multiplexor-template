package com.etlions.serverless.multiplexortemplate.functions;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MultiPlexorFunctions {
	
	@Bean
	Supplier<String> healthCheck(){
		return () -> "yellow from Multiplexor";
	}
	
	@Bean
	Function<String, String> toUpperCase(){
		return (input) -> input.toUpperCase() + "from Multiplexor" ;
	}
	
	@Bean
	Consumer<String> eatPayload(){
		return (input) -> System.out.println(input);
	}

}
