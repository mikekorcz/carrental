package pl.mkorcz.carrental.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pl.mkorcz.carrental.entity.Vehicle;
import pl.mkorcz.carrental.service.VehicleService;

@RestController
@RequestMapping("/vehicle")
public class VehicleController {

	@Autowired
	private VehicleService vehicleService;

	@PostMapping("/add")
	public String addVehicle(@RequestBody Vehicle vehicle) {
		vehicleService.saveVehicle(vehicle);
		return "Added new vehicle";
	}
	@GetMapping("/getallvehicles")
	public List<Vehicle> getAllVehicles() {
		return vehicleService.getAllVehicles();
	}
}
