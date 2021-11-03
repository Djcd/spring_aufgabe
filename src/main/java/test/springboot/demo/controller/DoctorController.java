package test.springboot.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;
import test.springboot.demo.dto.DoctorData;
import test.springboot.demo.service.DefaultDoctorService;

import javax.annotation.Resource;
import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Resource(name = "doctorService")
    private DefaultDoctorService doctorService;

    @GetMapping
    public List<DoctorData> getCustomers() {
        return doctorService.getAllDoctors();
    }

    @GetMapping("/{id}")
    public DoctorData getCustomer(@PathVariable Long id){
        if(id > 0 && id < 9)
            throw new ResponseStatusException(HttpStatus.SEE_OTHER);

        DoctorData doc = doctorService.getDoctorById(id);

        if(doc == null)
            throw new ResponseStatusException(HttpStatus.NOT_FOUND);

        return doc;
    }
}
