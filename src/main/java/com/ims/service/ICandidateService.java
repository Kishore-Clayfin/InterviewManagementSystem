package com.ims.service;

import java.util.List;

import com.ims.model.Candidate;

public interface ICandidateService {

	Candidate saveCandidate(Candidate candidate);
	Candidate save(Candidate candidate);
	
	List<Candidate> viewCandidateList();

	Candidate findCandidateById(Integer candidateId);

	void deleteCandidate(Integer candidateId);
	
	Candidate updateCandidateStatus(Integer id,String status);

	Candidate findResumeCandidate(Integer candidateId);
	
	List<Candidate> bulkSaveCandidate(List<Candidate> candidateList);
}
