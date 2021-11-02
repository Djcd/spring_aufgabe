package test.springboot.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class Doctor {

    @GetMapping("/doctor")
    public String doctorIndex() {
        return "doctor";
    }

    @RequestMapping("/doctor/{doctorID}")
    @ResponseBody
    public String getDoctor(@PathVariable(value="doctorID", required=true) int doctorID) {
        switch(doctorID){
            case 1:
                return "William Hartnell";
            case 2:
                return "Patrick Troughton";
            case 3:
                return "Jon Pertwee";
            case 4:
                return "Tom Baker";
            case 5:
                return "Peter Davison";
            case 6:
                return "Colin Baker";
            case 7:
                return "Sylvester McCoy";
            case 8:
                return "Paul McGann";
            case 9:
                return "Christopher Eccleston";
            case 10:
                return "David Tennant";
            case 11:
                return "Matt Smith";
            case 12:
                return "Peter Capaldi";
            case 13:
                return "Jodie Whittaker";
        }

        return "Doctor not found";
    }
}
