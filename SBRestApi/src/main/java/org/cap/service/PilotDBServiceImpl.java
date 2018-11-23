package org.cap.service;

import java.util.List;

import org.cap.dao.IPilotDBDao;
import org.cap.model.Pilot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("pilotDbService")
public class PilotDBServiceImpl implements IPilotService{


	@Autowired
	private IPilotDBDao pilotDbDao;
	
	@Override
	public List<Pilot> getAllPilots() {
		// TODO Auto-generated method stub
		return pilotDbDao.findAll();
	}

	@Override
	public Pilot findPilot(Integer pilotId) {
		// TODO Auto-generated method stub
		return pilotDbDao.findById(pilotId).get();
	}

	@Override
	public List<Pilot> createPilot(Pilot pilot) {
		pilotDbDao.save(pilot);
		return pilotDbDao.findAll();
	}

	@Override
	public List<Pilot> deletePilot(Integer pilotId) {
		
		pilotDbDao.deleteById(pilotId);
		return pilotDbDao.findAll();
		//return getAllPilots();
	}

	@Override
	public List<Pilot> updatePilot(Pilot pilot) {
		// TODO Auto-generated method stub
		return null;
	}

//
	
}
