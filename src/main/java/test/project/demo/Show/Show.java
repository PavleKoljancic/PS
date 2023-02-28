package test.project.demo.Show;






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
		return "Pavle Koljancic";
	}    
	@GetMapping(path = "/dejan2")
	public String getStudentds() 
	{
		return "Pavle Koljancic2";
	}
	@GetMapping(path = "/pavle2")
	public String getStudents2() 
	{
		return "Pavle Koljancic2";
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
	@GetMapping(path = "/bane1")
	public String b1() 
	{
		return "bane1";
	}
	@GetMapping(path = "/kezija")
	public String getTmp() 
	{
		return "kezijaa";
	}
	@GetMapping(path = "/novaGrana")
	public String getTm() 
	{
		return "Nova grana";
	}
	@GetMapping(path = "/pobjeda")
	public String getPobjeda() 
	{
		return "Pobjeda";
	}
	@GetMapping(path = "/f2")
	public String f2() 
	{
		return "f2";}
	@GetMapping(path = "/novaFunkcionalnost")
	public String getFukcionalnost() 
	{
		return "Nova funkcionalnost";
	}
	@GetMapping(path = "/dejanovaNova")
	public String getFukcionalnostNova() 
	{
		return "Nova funkcionalnost";
	}
	@GetMapping(path = "/dejanovadrugaNova")
	public String getFukcionalnostNovaDruga() 
	{
		return "Nova funkcionalnost";
	}
}