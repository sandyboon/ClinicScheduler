package org.sandy.clinicscheduler.client;

import org.sandy.clinicscheduler.shared.model.Doctor;

import com.google.gwt.core.client.EntryPoint;
import com.google.gwt.user.client.ui.RootPanel;

/**
 * Entry point classes define <code>onModuleLoad()</code>.
 */
public class ClinicScheduler implements EntryPoint {

	/**
	 * This is the entry point method.
	 */
	public void onModuleLoad() {
		Doctor loggedInDoctor = new Doctor("Dr. John Doe", 1);
		PatientListView patientListView = new PatientListView();
		 // Set the user's name in the PatientListView component
	    patientListView.setDoctorName(loggedInDoctor.getName());
		RootPanel.get("clinicRoot").add(patientListView);	   
		
	}
}
