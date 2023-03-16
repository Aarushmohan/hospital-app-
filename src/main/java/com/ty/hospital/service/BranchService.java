package com.ty.hospital.service;

import java.util.List;

import com.ty.hospital.dto.Branch;
import com.ty.hospital.dto.Encounter;

public interface BranchService {
	public Branch saveBranch(Branch branch, int hid);

	public Branch getBranchById(int id);

	public List<Branch> getAllBranch();

	public Encounter getBranchEncounters(int id);

	public Branch updateBranch(Branch branch, int id);

	public boolean deleteBranchById(int id);
}
