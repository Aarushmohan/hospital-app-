package com.ty.hospital.dto;

import java.time.LocalDateTime;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Encounter {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private int person_id;
	private LocalDateTime admit_date_time;
	private String reason;
	private String status;
	private LocalDateTime discharge_date_time;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPerson_id() {
		return person_id;
	}
	public void setPerson_id(int person_id) {
		this.person_id = person_id;
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
}
