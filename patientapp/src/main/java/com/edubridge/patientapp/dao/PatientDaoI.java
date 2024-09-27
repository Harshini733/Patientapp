
package com.edubridge.patientapp.dao;

import java.util.List;

import com.edubridge.patientapp.model.Patient;

public interface PatientDaoI {
	int addPatient(Patient p);
	List<Patient> getAllPatients();
	Patient getPatientByName(String name);
	int updatePatient(Patient p);
	void deletePatient(String name);
}
