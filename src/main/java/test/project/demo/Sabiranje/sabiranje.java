package test.project.demo.Sabiranje;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "api/sabiranje")
public class sabiranje {

    @Autowired
	public  sabiranje() {

	}

	@PostMapping(value = "")
    public double saberi(@RequestBody Operatori br) {
        return br.getA() + br.getB();
    }
}
