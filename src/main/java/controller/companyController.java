package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class companyController {
	
	@Autowired
	private companyRepository cr;
	
	@GetMapping(path="/")	
	public@ResponseBody String greeting()
	{
		return "Welcome to Company REST  ";
	}
	
	@GetMapping(path="/add")	
	public @ResponseBody String  add()
	{
		
		companyModel cm = new companyModel();		
		cm.setUsername("aditya");
		cm.setPassword("password");
		cr.save(cm);
		return "added";
	}
	
	@GetMapping(path="/all")
	public @ResponseBody Iterable<companyModel> test()
	{
		return cr.findAll();
	}
}
