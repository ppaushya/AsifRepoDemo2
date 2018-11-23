package org.cap.model;

import java.time.LocalDate;

import javax.persistence.Entity;
import javax.persistence.Id;

import org.springframework.boot.autoconfigure.domain.EntityScan;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
public class Pilot {
	@Id
	private int pilotId;
	private String pilotName;
	private boolean isCertified;
	private double salary;
	
	@JsonFormat(pattern="dd-MMM-yyyy")
	private LocalDate dateOfBirth;
	
	public Pilot() {
		
	}
	
	public Pilot(int pilotId, String pilotName, boolean isCertified, double salary) {
		super();
		this.pilotId = pilotId;
		this.pilotName = pilotName;
		this.isCertified = isCertified;
		this.salary = salary;
	}
	
	
	public Pilot(int pilotId, String pilotName, boolean isCertified, double salary, LocalDate dateOfBirth) {
		super();
		this.pilotId = pilotId;
		this.pilotName = pilotName;
		this.isCertified = isCertified;
		this.salary = salary;
		this.dateOfBirth = dateOfBirth;
	}

	public int getPilotId() {
		return pilotId;
	}
	public void setPilotId(int pilotId) {
		this.pilotId = pilotId;
	}
	public String getPilotName() {
		return pilotName;
	}
	public void setPilotName(String pilotName) {
		this.pilotName = pilotName;
	}
	public boolean isCertified() {
		return isCertified;
	}
	public void setCertified(boolean isCertified) {
		this.isCertified = isCertified;
	}
	
	public void setSalary(double salary) {
		this.salary = salary;
	}
	
	
	
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public double getSalary() {
		return salary;
	}

	@Override
	public String toString() {
		return "Pilot [pilotId=" + pilotId + ", pilotName=" + pilotName + ", isCertified=" + isCertified + ", salary="
				+ salary + "]";
	}
	
	

}
