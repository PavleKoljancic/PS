package test.project.demo.Mnozenje;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping(path = "api/mnozenje")
public class Mnozenje {
    @Autowired
    Mnozenje( ) {}
    @PostMapping(value="")
    public double postMethodName(@RequestBody Operatori entity) {
        System.out.println("aaaa");
      
        return entity.getA()*entity.getB();
    }
    
}
