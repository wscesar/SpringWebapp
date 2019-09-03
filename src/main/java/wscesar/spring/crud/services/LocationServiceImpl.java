package wscesar.spring.crud.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import wscesar.spring.crud.entities.Location;
import wscesar.spring.crud.repositories.LocationRepository;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private LocationRepository repository;

	@Override
	public Location saveLocation(Location location) {
		return repository.save(location);
	}

	@Override
	public Location updateLocation(Location location) {
		return repository.save(location);
	}

	@Override
	public void deleteLocation(Location location) {
		repository.delete(location);
	}

	@Override
	public Location getLocationById(int id) {
		Optional<Location> location = repository.findById(id);
		return location.orElse(null);
	}

	@Override
	public List<Location> getAllLocations() {
		return repository.findAll();
	}

}
