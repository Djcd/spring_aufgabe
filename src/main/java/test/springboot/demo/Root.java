package test.springboot.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class Root {
    @GetMapping("/")
    public String rootIndex() {
        return "root";
    }
}
