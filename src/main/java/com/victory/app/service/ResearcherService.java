package com.victory.app.service;

import com.victory.app.Repository.ResearcherRepository;
import com.victory.app.entity.ResearcherEntity;
import com.victory.app.model.ResearcherModel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResearcherService {
    @Autowired
    private ResearcherRepository researcherRepository;

    public ResearcherEntity getName() {
        researcherRepository.findById(1);
        return new ResearcherEntity();
    }

    public void save(ResearcherModel researcherModel) {
        ResearcherEntity res=transformInputToModel(researcherModel);
        researcherRepository.save(res);
    }

    private ResearcherEntity transformInputToModel(ResearcherModel researcherModel) {
        ResearcherEntity researcher = new ResearcherEntity();
        researcher.setAddress(researcherModel.getAddress());
        researcher.setAge(researcherModel.getAge());
        researcher.setName(researcherModel.getName());
        return researcher;
    }

    public List<ResearcherEntity> findByName(String name) {
       return researcherRepository.findByName(name);
    }
}
