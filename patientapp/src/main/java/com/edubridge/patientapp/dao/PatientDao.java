package com.edubridge.patientapp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.edubridge.patientapp.model.Patient;
import com.edubridge.patientapp.util.DBUtils;

/*
DAO-Data Access Object
To maintain only database persistence logic (Jdbc Code)
*/
public class PatientDao implements PatientDaoI {
	private static Connection pat = null;
	
	static{
		pat = DBUtils.getConnection();
	}
	
	public int addPatient(Patient p) {
		String insert = "insert into patient_details(name,id,email,mobile) values(?,?,?,?)";
		int status = 0;
		try {
			PreparedStatement ps = pat.prepareStatement(insert);
			ps.setString(1, p.getName());
			ps.setInt(2, p.getId());
			ps.setString(3, p.getEmail());
			ps.setLong(4, p.getMobile());
			status = ps.executeUpdate();
			
		} catch (SQLException e) {
			e.printStackTrace();
		}		
		return status;
	}

	@Override
	public List<Patient> getAllPatients() {
		List<Patient> patients = new ArrayList<Patient>();
		String select = "select * from patient_details";		
		try {
			PreparedStatement ps = pat.prepareStatement(select);
			ResultSet rs = ps.executeQuery();
			while(rs.next()) {
				Patient patient = new Patient();
				patient.setId(rs.getInt("id"));
				patient.setName(rs.getString("name"));
				patient.setEmail(rs.getString("email"));
				patient.setMobile(rs.getLong("mobile"));				
				patients.add(patient);			
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		return patients;
	}

	@Override
	public Patient getPatientByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int updatePatient(Patient p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deletePatient(String name) {
		// TODO Auto-generated method stub
		
	}


}

