package org.sandy.clinicscheduler.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

public class PatientListView extends Composite {

	interface PatientListViewUiBinder extends UiBinder<Widget, PatientListView> {
	}

	private static PatientListViewUiBinder uiBinder = GWT.create(PatientListViewUiBinder.class);
	
	@UiField
	SpanElement doctorNameLabel;

	@UiField

	TextBox patientNameTextBox;

	@UiField
	Button addPatientButton;
	
	@UiField
    FlexTable patientTable;

	public PatientListView() {		
		initWidget(uiBinder.createAndBindUi(this));	
		patientTable.setText(0, 0, "Patient ID");
		patientTable.setText(0, 1, "Patient Name");
		patientTable.setText(0, 2, "Patient Schedule");
	}
	

	// Add a setter method for the doctorNameLabel
	public void setDoctorName(String name) {
		doctorNameLabel.setInnerText(name);
	}

//	public PatientListView(String firstName) {
//		initWidget(uiBinder.createAndBindUi(this));
//		button.setText(firstName);
//	}
//
//	@UiHandler("button")
//	void onClick(ClickEvent e) {
//		Window.alert("Hello!");
//	}
//
//	public void setText(String text) {
//		button.setText(text);
//	}
//
//	public String getText() {
//		return button.getText();
//	}

}
