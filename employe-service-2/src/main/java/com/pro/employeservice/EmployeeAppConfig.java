package com.pro.employeservice;

import org.modelmapper.ModelMapper;
import org.modelmapper.internal.bytebuddy.asm.Advice.Return;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@Configuration
public class EmployeeAppConfig {
	
	@Value("${adresssercice.base.url}")
	private String adressBaseURL;
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}
}
	
		
