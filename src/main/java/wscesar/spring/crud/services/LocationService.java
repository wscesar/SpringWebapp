package wscesar.spring.crud.services;

import java.util.List;

import wscesar.spring.crud.entities.Location;

public interface LocationService {
	
	Location saveLocation(Location location);
	Location updateLocation(Location location);
	void deleteLocation(Location location);
	Location getLocationById(int id);
	
	List<Location> getAllLocations();
	

}
