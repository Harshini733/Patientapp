package com.edubridge.patientapp.service;

import java.util.List;
import com.edubridge.patientapp.dao.PatientDao;
import com.edubridge.patientapp.model.Patient;



public class PatientService implements PatientServiceI{
	private PatientDao dao;
	
	
	public PatientService() {
		dao = new PatientDao();
	}

	@Override
	public int addPatient(Patient p) {
		return dao.addPatient(p);
	}

	@Override
	public List<Patient> getAllPatients() {
		return dao.getAllPatients();
	}

	@Override
	public Patient getPatientByName(String name) {
		return dao.getPatientByName(name);
	}

	@Override
	public int updatePatient(Patient p) {
		return dao.updatePatient(p);
	}

	@Override
	public void deletePatient(String name) {
		dao.deletePatient(name);
	}

	@Override
	public int addPatient(PatientDao p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int updatePatient(PatientDao p) {
		// TODO Auto-generated method stub
		return 0;
	}
}