package com.clinica.doctor.controller;

import com.clinica.doctor.entity.Doctor;
import com.clinica.doctor.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;

    @GetMapping
    public List<Doctor> findAll() {
        return this.doctorService.findAll();
    }

    @PostMapping
    public Doctor save(@RequestBody Doctor doctor) {
        return this.doctorService.saveDoctor(doctor);
    }

    @GetMapping("/{id}")
    public Doctor findById(@PathVariable(value = "id") String id) {
        return this.doctorService.findById(Integer.valueOf(id));
    }
}
