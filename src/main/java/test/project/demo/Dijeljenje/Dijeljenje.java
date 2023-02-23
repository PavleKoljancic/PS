package test.project.demo.Dijeljenje;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(path = "api/dijeljenje")
public class Dijeljenje {
    @Autowired
    Dijeljenje( ) {}
    @PostMapping(value="")
    public double podijeli(@RequestBody Operatori entity) {
      
        return entity.getA()/entity.getB();
    }
    
}
