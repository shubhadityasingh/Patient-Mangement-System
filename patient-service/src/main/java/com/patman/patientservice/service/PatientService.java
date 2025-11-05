package com.patman.patientservice.service;

import com.patman.patientservice.dto.PatientResponseDTO;
import com.patman.patientservice.model.Patient;
import com.patman.patientservice.repository.PatientRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PatientService {
    private PatientRepository patientRepository;

    public PatientService(PatientRepository patientRepository) {
        this.patientRepository = patientRepository;
    }

    public List<PatientResponseDTO> getPatients() {
        List<Patient>  patients = patientRepository.findAll();
    }
}
