package com.edubridge.patientapp;

import java.util.List;
import java.util.Scanner;

import com.edubridge.patientapp.model.Patient;
import com.edubridge.patientapp.service.PatientService;

public class App {
	private static final Patient[] Patients = null;
	private static final Patient newPatient = null;

	public static void main(String[] args) {
		PatientService service = new PatientService();
		
		Scanner in = new Scanner(System.in);
		while(true) {
			System.out.println("My Patient Application");
			System.out.println("++++++++++++++++++++++");
			System.out.println("1. Add Patient");
			System.out.println("2. View Patient");
			System.out.println("3. Search Patient");
			System.out.println("4. Update Patient");
			System.out.println("5. Delete Patient");
			System.out.println("0. Exit");
			System.out.println("Please choose option: ");
			int option = in.nextInt();
			
			switch(option) {
			case 1:
				System.out.println("Add Patient Details");
				System.out.println("--------------------");
				System.out.println("Enter Name: ");
				String name = in.next();
				System.out.println("Enter Id: ");
				String id = in.next();
				
				System.out.println("Enter Email: ");
				String email = in.next();
				
				System.out.println("Enter Mobile: ");
				long mobile = in.nextLong();
				
				Patient newPatient = new Patient();
				newPatient.setName(name);
				newPatient.setEmail(email);
				newPatient.setMobile(mobile);
				
				int status = service.addPatient(newPatient);
				
				if(status >= 1) {
					System.out.println("New patient added successfully!");
				}else {
					System.out.println("Something is wrong");
				}				
				break;
				
			case 2:
				System.out.println("Display All Patients");
				System.out.println("-----------------------");
				List<Patient> contacts = service.getAllPatients();
				for(Patient p : Patients) {
					System.out.println(p.getId()+"\t"+p.getName()+"\t"+p.getEmail()+"\t"+p.getMobile());
				}
				
				break;
			case 3:
				System.out.println("Search Patient");
				break;
			case 4:
				System.out.println("Update Patient");
				break;
			case 5:
				System.out.println("Delete Patient");
				break;
			case 0:
				System.out.println("Bye!!!");
				System.exit(0);
			default:
				System.out.println("Invalid Option Selected!");
				break;
			}
		}
	}
}

	

