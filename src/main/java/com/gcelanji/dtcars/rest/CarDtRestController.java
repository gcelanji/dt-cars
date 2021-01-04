package com.gcelanji.dtcars.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.gcelanji.dtcars.entity.Car;
import com.gcelanji.dtcars.exception_handling.CarDtNotFoundException;
import com.gcelanji.dtcars.service.CarService;

@RestController
@RequestMapping("/api")
public class CarDtRestController {
	
	@Autowired
	private CarService carService;
	
	@GetMapping("/dt_cars")
	public List<Car> showDtCars() {
		return carService.findAll();
	}
	
	@GetMapping("/dt_cars/{carId}")
	public Car getCarDt(@PathVariable int carId) {
		
		Car carDt = carService.findById(carId);
		
		if(carDt == null) {
			throw new CarDtNotFoundException("CarDt id not found - " + carId);
		}
		
		return carDt;
	}
	
	@PostMapping("/dt_cars")
	public Car addCarDt(@RequestBody Car carDt) {
		
		carDt.setId(0);
		
		carService.save(carDt);
		
		return carDt;
	}
	
	@PutMapping("/dt_cars")
	public Car updateCarDt(@RequestBody Car carDt) {
		
		carService.save(carDt);
		
		return carDt;
	}
	
	@DeleteMapping("/dt_cars/{carId}")
	public String deleteCarDt(@PathVariable int carId) {
		
		Car carDt = carService.findById(carId);
		
		if(carDt == null) {
			throw new CarDtNotFoundException("CarDt id not found - " + carId);
		}
		
		carService.deleteById(carId);
		
		return "Deleted CarDt id: " + carId;
	}
	
}
