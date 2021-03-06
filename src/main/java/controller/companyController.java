package controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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
	@GetMapping(path="/add/{uname}/{pwd}")	
	public @ResponseBody String  add(@PathVariable("uname") String uname,@PathVariable("pwd") String pwd )
	{
		
		companyModel cm = new companyModel();		
		cm.setUsername(uname);
		cm.setPassword(pwd);
		cr.save(cm);
		return "add";
	}
	@GetMapping(path="/all")
	@CrossOrigin(origins = "http://localhost:4200", maxAge = 3600)
	public @ResponseBody Iterable<companyModel> test()
	{
		return cr.findAll();
	}
}
