package com.ty.hospital.dao;

import java.util.List;

import com.ty.hospital.dto.Branch;
import com.ty.hospital.dto.Encounter;
import com.ty.hospital.dto.Hospital;

public interface BranchDao {
	public Branch saveBranch(Branch branch,int hid);
	public Branch getBranchById(int id);
	public List<Branch> getAllBranch();
	public List<Branch> getHospitalBranches(int hid);
	public Encounter getBranchEncounters(int id);
	public Branch updateBranch(Branch branch,int id);
	public boolean deleteBranchById(int id);
}
