package com.example.SpringPracProg.services;

import com.example.SpringPracProg.entities.Jobs;

public interface JobsService {

    Iterable<Jobs> listAllJobs();

    Jobs getJobById(Integer id);

    Jobs saveJob(Jobs job);

    void deleteJob(Integer id);

    Boolean checkIfExists(Integer id);

    public Iterable<Jobs> listAllJobsPaging(Integer pageNr, Integer howManyOnPage);
}
