package org.cap.dao;

import java.util.List;

import org.cap.model.Pilot;

public interface IPilotDao {
	
	public List<Pilot> getAllPilots();

	public Pilot findPilot(Integer pilotId);

	public List<Pilot> createPilot(Pilot pilot);

	public List<Pilot> deletePilot(Integer pilotId);

	public List<Pilot> updatePilot(Pilot pilot);

	

}
