package org.sandy.clinicscheduler.shared.model;

public class Doctor {

	public Doctor(String name, Integer id) {
		super();
		this.name = name;
		this.id = id;
	}
	private String name;
	private Integer id;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
