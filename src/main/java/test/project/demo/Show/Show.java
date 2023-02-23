package test.project.demo.Show;





import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/show")
public class Show {
	
    

	
	@Autowired //Magicna instancijacija
	public Show() {

	}




	@GetMapping
	public String [] hello() 
	{
		String [] arr =  {"Cao","Kolege"};
        return arr;
	}
    @GetMapping(path = "/pavle")
	public String getStudents() 
	{
		return "pavle";
	}
	@GetMapping(path = "/sone")
	public String getStudents11()
	{
		return "Sone";
	}
	@GetMapping(path = "/bane")
	public String b() 
	{
		return "bane";
	}
	@GetMapping(path = "/kezija")
	public String getTmp() 
	{
		return "kezijaa";
	}
}