package controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
 
@SpringBootApplication
public class MicroserviceApplication {

	@Autowired
	
	public static void main(String[] args) {
		SpringApplication.run(MicroserviceApplication.class, args);
	}
}
