package com.luv2code.springboot.demo.mycoolapp.Rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class MycoolappApplication {

	public static void main(String[] args) {
		SpringApplication.run(MycoolappApplication.class, args);
	}

	@RestController

	public static class FunRestController {

		/////////
		@GetMapping("/")
		public String sayhello(){
			return "hi i am sree";
		}
		@GetMapping("/r")
		public String Sree(){
			return"apprama sapadra";
		}



	}
}
