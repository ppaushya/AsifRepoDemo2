package org.cap.service;

import java.util.List;

import org.cap.dao.IPilotDao;
import org.cap.model.Pilot;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("pilotService")
public class PilotServiceImpl implements IPilotService{

	@Autowired
	private IPilotDao pilotDao;
	
	@Override
	public List<Pilot> getAllPilots() {
		
		return pilotDao.getAllPilots();
	}

	@Override
	public Pilot findPilot(Integer pilotId) {
		// TODO Auto-generated method stub
		return pilotDao.findPilot(pilotId);
	}

	@Override
	public List<Pilot> createPilot(Pilot pilot) {
		// TODO Auto-generated method stub
		return pilotDao.createPilot(pilot);
	}

	@Override
	public List<Pilot> deletePilot(Integer pilotId) {
		// TODO Auto-generated method stub
		return pilotDao.deletePilot(pilotId);
	}

	@Override
	public List<Pilot> updatePilot(Pilot pilot) {
		// TODO Auto-generated method stub
		return pilotDao.updatePilot(pilot);
	}

}
