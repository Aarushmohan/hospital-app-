package com.ty.hospital.dto;

import java.time.LocalDateTime;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Encounter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private LocalDateTime admit_date_time;
	private String reason;
	private String status;
	private LocalDateTime discharge_date_time;
	@ManyToOne
	@JoinColumn(name = "person_id")
	private Person person;
	@ManyToOne
	@JoinColumn
	private Branch branch;
	@OneToMany(mappedBy = "encounter")
	private List<Observation> observation;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "encounter")
	private List<MedOrder> medOrder;

	public List<Observation> getObservation() {
		return observation;
	}

	public void setObservation(List<Observation> observation) {
		this.observation = observation;
	}

	public List<MedOrder> getMedOrder() {
		return medOrder;
	}

	public void setMedOrder(List<MedOrder> medOrder) {
		this.medOrder = medOrder;
	}

	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public LocalDateTime getAdmit_date_time() {
		return admit_date_time;
	}

	public void setAdmit_date_time(LocalDateTime admit_date_time) {
		this.admit_date_time = admit_date_time;
	}

	public String getReason() {
		return reason;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public LocalDateTime getDischarge_date_time() {
		return discharge_date_time;
	}

	public void setDischarge_date_time(LocalDateTime discharge_date_time) {
		this.discharge_date_time = discharge_date_time;
	}

	public Branch getBranch() {
		return branch;
	}

	public void setBranch(Branch branch) {
		this.branch = branch;
	}

}
