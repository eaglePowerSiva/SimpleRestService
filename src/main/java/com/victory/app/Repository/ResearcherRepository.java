package com.victory.app.Repository;

import com.victory.app.entity.ResearcherEntity;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResearcherRepository extends CrudRepository<ResearcherEntity, Integer> {
    public List<ResearcherEntity> findByName(String name);


}
