package test.springboot.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import test.springboot.demo.dto.DoctorData;
import test.springboot.demo.model.Doctor;
import test.springboot.demo.repository.DoctorRepository;
import test.springboot.demo.service.interfaces.DoctorService;

import java.util.ArrayList;
import java.util.List;

@Service("doctorService")
public class DefaultDoctorService implements DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    @Override
    public DoctorData saveDoctor(DoctorData doctor) {
        Doctor doc = populateCustomerEntity(doctor);
        return populateDoctorData(doctorRepository.save(doc));
    }

    @Override
    public boolean deleteDoctor(Long doctorId) {
        doctorRepository.deleteById(doctorId);
        return true;
    }

    @Override
    public List<DoctorData> getAllDoctors() {
        List<DoctorData> doctors = new ArrayList<>();
        List<Doctor> doctorList = doctorRepository.findAll();
        doctorList.forEach(doctor -> {
            doctors.add(populateDoctorData(doctor));
        });
        return doctors;
    }

    @Override
    public DoctorData getDoctorById(Long doctorId) {
        Doctor doc = doctorRepository.findById(doctorId).orElse(null);
        if(doc == null)
            return null;
        else
            return populateDoctorData(doc);
    }

    private DoctorData populateDoctorData(final Doctor doctor){
        DoctorData doctorData = new DoctorData(doctor.getId(), doctor.getName());
        return doctorData;
    }

    private Doctor populateCustomerEntity(DoctorData doctorData){
        Doctor doctor = new Doctor();
        doctor.setName(doctorData.getName());
        return doctor;
    }
}
