package org.cap.dao;



import org.cap.model.Pilot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository("pilotDbDao")

public interface IPilotDBDao extends JpaRepository<Pilot,Integer>{

	
}
