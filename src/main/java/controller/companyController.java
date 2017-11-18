package controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class companyController {
	
	
	@GetMapping("/")
	@ResponseBody
	public String greeting()
	{
		return "Welcome to Company REST  service";
	}

}
