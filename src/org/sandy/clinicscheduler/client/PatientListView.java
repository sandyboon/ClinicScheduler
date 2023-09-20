package org.sandy.clinicscheduler.client;

import org.sandy.clinicscheduler.shared.IDGenerator;

import com.google.gwt.core.client.GWT;
import com.google.gwt.dom.client.SpanElement;
import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.uibinder.client.UiBinder;
import com.google.gwt.uibinder.client.UiField;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.Anchor;
import com.google.gwt.user.client.ui.Button;
import com.google.gwt.user.client.ui.Composite;
import com.google.gwt.user.client.ui.FlexTable;
import com.google.gwt.user.client.ui.Hyperlink;
import com.google.gwt.user.client.ui.TextBox;
import com.google.gwt.user.client.ui.Widget;

import com.google.gwt.user.cellview.client.TextColumn;

import com.google.gwt.cell.client.DateCell;
import com.google.gwt.user.datepicker.client.DateBox;
import com.google.gwt.user.datepicker.client.DateBox.Format;

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
		initClickHandlers();
	}
	

	private void initClickHandlers() {		
		addPatientButton.addClickHandler(ce -> this.addPatientRow());
	}


	
	private void addPatientRow() {
		int rowIndexToInsert = patientTable.getRowCount() ;
		patientTable.insertRow(rowIndexToInsert);
		patientTable.setText(rowIndexToInsert, 0, String.valueOf(IDGenerator.PATIENT_ID_GENERATOR.getPatientId()));
		patientTable.setText(rowIndexToInsert, 1, patientNameTextBox.getValue());
//		patientTable.setText(rowIndexToInsert, 2, "Book Appointment");
		// add click handler for the appointment cell
//		Anchor bookAppointmentLink = new Anchor("Book Appointment");
//		bookAppointmentLink.addClickHandler(ce -> Window.alert("I am clicked"));
		
		// Create a DateCell with custom format
        
        DateBox dateBox = new DateBox();
        
		 patientTable.setWidget(rowIndexToInsert, 2, dateBox );
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
