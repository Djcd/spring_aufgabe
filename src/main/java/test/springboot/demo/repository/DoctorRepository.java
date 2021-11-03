package test.springboot.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import test.springboot.demo.model.Doctor;

@Repository
public interface DoctorRepository extends JpaRepository<Doctor,Long> { }
