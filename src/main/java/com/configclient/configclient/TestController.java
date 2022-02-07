package com.configclient.configclient;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@Value("${some.value}")
	private int myValue;
	
	@Value("${some.value1}")
	private int myValue1;
	
	
	
	@GetMapping("/values")
	public String values() {
		return "Values on server: \n" + "\nValue 0=" + myValue + "\nValue 1=" + myValue1;
	}
	
	@GetMapping("/suma")
	public double suma() {
		return this.myValue+this.myValue1;
	}
	
	@GetMapping("/multiplica")
	public double multiplica() {
		return this.myValue*this.myValue1;
	}
	
		
	@GetMapping("/resta")
	public double resta() {
		return this.myValue-this.myValue1;
	}
	
	@GetMapping("/divide")
	public double divide() {
		return this.myValue/this.myValue1;
	}
	
	
}