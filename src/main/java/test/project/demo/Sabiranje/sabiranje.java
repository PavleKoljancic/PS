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
    public int saberi(@RequestBody brojevi br) {
        return br.getBr1() + br.getBr2();
    }
}
