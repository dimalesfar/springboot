package bootwildfly;

import java.util.Date;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestResource {
	
    @RequestMapping("/greeting")
    public String greeting() {
        return "this is zak from ubuntu" +new Date().toString();
    }
    
    @RequestMapping("/greeting2")
    public String greeting2() {
        return "this is zak from ubuntu 2" +new Date().toString();
    }

}
