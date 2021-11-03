package test.springboot.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import test.springboot.demo.service.DefaultDoctorService;

import javax.annotation.Resource;

@SpringBootApplication
@Controller
public class DemoApplication {

	@Resource(name = "doctorService")
	private DefaultDoctorService doctorService;

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("/")
	public String rootIndex(Model model) {
		model.addAttribute("doctors", doctorService.getAllDoctors());
		return "root";
	}
}
