package pl.mkorcz.carrental.service;

import java.util.List;

import org.springframework.stereotype.Service;

import pl.mkorcz.carrental.entity.Vehicle;

@Service
public interface VehicleService {

	public Vehicle saveVehicle(Vehicle vehicle);

	public List<Vehicle> getAllVehicles();
}
