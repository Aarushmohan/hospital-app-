package com.ty.hospital.service.implementation;

import java.util.List;

import com.ty.hospital.dao.implematation.EncounterDaoImp;
import com.ty.hospital.dto.Encounter;
import com.ty.hospital.service.EncounterService;

public class EncounterServiceImp implements EncounterService{
	EncounterDaoImp encounterDaoImp = new EncounterDaoImp();
	@Override
	public Encounter cretaeEncounter(int bid, int pid, Encounter encounter) {
		return encounterDaoImp.cretaeEncounter(bid, pid, encounter);
	}

	@Override
	public Encounter getEncounterById(int id) {
		return encounterDaoImp.getEncounterById(id);
	}

	@Override
	public List<Encounter> getEncounterByBranchesId(int bid) {
		return encounterDaoImp.getEncounterByBranchesId(bid);
	}

	@Override
	public List<Encounter> getEncounterByPersonId(int pid) {
		return encounterDaoImp.getEncounterByPersonId(pid);
	}

	@Override
	public Encounter updateEncounter(Encounter encounter, int id) {
		return encounterDaoImp.updateEncounter(encounter, id);
	}

	@Override
	public boolean deleteEncounterById(int id) {
		return encounterDaoImp.deleteEncounterById(id);
	}
	
}
