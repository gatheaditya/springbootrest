package controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class companyController {
	
	
	@GetMapping("/")
	public String greeting()
	{
		return "Welcome to Company REST Service";
	}

}
