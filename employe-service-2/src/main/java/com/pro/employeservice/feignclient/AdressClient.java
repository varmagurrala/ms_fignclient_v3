package com.pro.employeservice.feignclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.pro.employeservice.dto.AdressResponce;
//http://localhost:8080/api/adress/1
@FeignClient(name="abc",url="http://localhost:8080",path = "/api")
public interface AdressClient {
	
	@GetMapping("/adress/{empid}")
	AdressResponce getAdressByEmployeeId(@PathVariable("empid" )Long empid);

}
