package com.ty.hospital.service.implementation;

import java.util.List;

import com.ty.hospital.dao.implematation.ObservationDaoImp;
import com.ty.hospital.dto.Observation;
import com.ty.hospital.service.ObservationService;

public class ObservationServiceImp implements ObservationService{
	ObservationDaoImp observationDaoImp = new ObservationDaoImp();
	@Override
	public Observation createObservation(Observation observation, int eid) {
		return observationDaoImp.createObservation(observation, eid);
	}

	@Override
	public Observation getObservationById(int id) {
		return observationDaoImp.getObservationById(id);
	}

	@Override
	public List<Observation> getAllObservationByEncounterId(int eid) {
		return observationDaoImp.getAllObservationByEncounterId(eid);
	}

	@Override
	public Observation updateObservation(Observation observation, int id) {
		return observationDaoImp.updateObservation(observation, id);
	}

	@Override
	public boolean deleteObservation(int id) {
		return observationDaoImp.deleteObservation(id);
	}

}
