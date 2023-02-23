package test.project.demo.Oduzimanje;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping(path = "api/oduzimanje")
public class Oduzimanje {
    @Autowired
    Oduzimanje() {}
    @PostMapping(value="")
    public double postMethodName(@RequestBody Operatori entity) {
        return entity.getA()-entity.getB();
    }
}
