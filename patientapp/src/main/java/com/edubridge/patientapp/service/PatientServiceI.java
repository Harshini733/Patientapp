
package com.edubridge.patientapp.service;

import java.util.List;

import com.edubridge.patientapp.dao.PatientDao;
import com.edubridge.patientapp.model.Patient;

public interface PatientServiceI {
	int addPatient(PatientDao p);
	List<Patient> getAllPatients();
	Patient getPatientByName(String name);
	int updatePatient(PatientDao p);
	void deletePatient(String name);
	int addPatient(Patient p);
	int updatePatient(Patient p);
}

