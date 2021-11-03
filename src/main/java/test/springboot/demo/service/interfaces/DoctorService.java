package test.springboot.demo.service.interfaces;

import test.springboot.demo.dto.DoctorData;

import java.util.List;

public interface DoctorService {
    DoctorData saveDoctor(DoctorData customer);
    boolean deleteDoctor(final Long doctorId);
    List<DoctorData> getAllDoctors();
    DoctorData getDoctorById(final Long doctorId);
}
