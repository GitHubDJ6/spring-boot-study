package cloud.ximalaya.springboot.web;

import cloud.ximalaya.springboot.pojo.Bank;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private Bank bank;
    @GetMapping("/hello")
    public Bank hello(){
        return bank;
    }

}
