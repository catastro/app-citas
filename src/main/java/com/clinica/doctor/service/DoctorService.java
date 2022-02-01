package com.clinica.doctor.service;

import com.clinica.doctor.entity.Doctor;

import java.util.List;

public interface DoctorService {

    Doctor saveDoctor(Doctor doctor);

    List<Doctor> findAll();
    Doctor findById(Integer id);
}
