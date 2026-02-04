package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.Candidate;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

@Service
@Slf4j
public class RecruitService {

    private static final Logger log = LoggerFactory.getLogger(RecruitService.class);

    private List<Candidate> candidateList = new ArrayList<>();

    public List<Candidate> getCandidateList() {
        return candidateList;
    }

    public void insertCandidate(Candidate candidate) {
        candidateList.add(candidate);
        log.info("Candidate details added successfully");
    }

    public List<Candidate> viewAllCandidates() {
        if (candidateList.isEmpty()) {
            log.error("Candidate List is empty");
        } else {
            log.info("Candidate details are Listed");
        }
        return candidateList;
    }
}
