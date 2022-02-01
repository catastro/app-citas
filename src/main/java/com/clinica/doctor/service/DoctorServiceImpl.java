package com.clinica.doctor.service;


import com.clinica.doctor.entity.Doctor;
import com.clinica.doctor.repository.DoctorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.print.Doc;
import java.util.List;

@Service
public class DoctorServiceImpl implements DoctorService{

    @Autowired
    private DoctorRepository repository;

    @Override
    public Doctor saveDoctor(Doctor doctor) {
        return repository.saveAndFlush(doctor);
    }

    @Override
    public List<Doctor> findAll() {
        return repository.findAll();
    }

    @Override
    public Doctor findById(Integer id) {
        return repository.findById(id).orElse(null);
    }

}
