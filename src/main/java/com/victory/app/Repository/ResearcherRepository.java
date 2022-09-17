package com.victory.app.Repository;

import com.victory.app.entity.Researcher;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public  interface ResearcherRepository extends CrudRepository<Researcher,Integer> {

}
