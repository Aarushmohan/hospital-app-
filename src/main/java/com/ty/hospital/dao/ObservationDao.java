package com.ty.hospital.dao;

import java.util.List;

import com.ty.hospital.dto.Observation;

public interface ObservationDao {
	public Observation createObservation(Observation observation, int eid);

	public Observation getObservationById(int id);

	public List<Observation> getAllObservationByEncounterId(int eid);

	public Observation updateObservation(Observation observation, int id);

	public boolean deleteObservation(int id);
}
