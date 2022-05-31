package com.ty.hospital.service;

import java.util.List;

import com.ty.hospital.dto.Observation;

public interface ObservationService {
	public Observation createObservation(Observation observation, int eid);

	public Observation getObservationById(int id);

	public List<Observation> getAllObservationByEncounterId(int eid);

	public Observation updateObservation(Observation observation, int id);

	public boolean deleteObservation(int id);
}
