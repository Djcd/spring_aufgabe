package test.springboot.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import test.springboot.demo.service.DefaultDoctorService;

import javax.annotation.Resource;

@Controller
public class RootController {

    @Resource(name = "doctorService")
    private DefaultDoctorService doctorService;

    @GetMapping("/")
    public String rootIndex(Model model) {
        model.addAttribute("doctors", doctorService.getAllDoctors());
        return "root";
    }
}
