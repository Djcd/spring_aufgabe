package test.springboot.demo.service.interfaces;

import test.springboot.demo.dto.DoctorData;

import java.util.List;

public interface DoctorService {
    DoctorData saveDoctor(DoctorData doctor);
    boolean deleteDoctor(final Long doctorId);
    DoctorData updateDoctor(DoctorData doctor);
    List<DoctorData> getAllDoctors();
    DoctorData getDoctorById(final Long doctorId);
}
