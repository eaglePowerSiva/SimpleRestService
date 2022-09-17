package com.victory.app.service;

import com.victory.app.Repository.ResearcherRepository;
import com.victory.app.entity.Researcher;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ResearcherService {
    @Autowired
    private ResearcherRepository researcherRepository;

    public Researcher getName(){
        researcherRepository.findById(1);
        return new Researcher();
    }
}
