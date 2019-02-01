package com.example.SpringPracProg.services;

import com.example.SpringPracProg.entities.Jobs;
import com.example.SpringPracProg.repositories.JobsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class JobsServiceImpl implements JobsService {

    @Autowired
    private JobsRepository jobsRepository;

    @Override
    public Iterable<Jobs> listAllJobs() {
        return jobsRepository.findAll();
    }

    @Override
    public Jobs getJobById(Integer id) {
        return jobsRepository.findById(id).get();
    }

    @Override
    public Jobs saveJob(Jobs job) {
        return jobsRepository.save(job);
    }

    @Override
    public void deleteJob(Integer id) {
        jobsRepository.deleteById(id);
    }

    @Override
    public Boolean checkIfExists(Integer id) {
        return jobsRepository.existsById(id);
    }

    @Override
    public Iterable<Jobs> listAllJobsPaging(Integer pageNr, Integer howManyOnPage) {
        return jobsRepository.findAll(new PageRequest(pageNr, howManyOnPage));
    }
}
