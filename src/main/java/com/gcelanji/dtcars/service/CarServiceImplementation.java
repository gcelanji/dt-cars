package com.gcelanji.dtcars.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gcelanji.dtcars.dao.CarRepository;
import com.gcelanji.dtcars.entity.Car;

@Service
public class CarServiceImplementation  implements CarService{

	@Autowired
	private CarRepository carRepository;
	
	@Override
	public List<Car> findAll() {
		return carRepository.findAll();
	}

	@Override
	public Car findById(int theId) {
		
		Optional<Car> result = carRepository.findById(theId);
		
		Car carDt = null;
		if(result.isPresent()) {
			carDt = result.get();
		}
		
		return carDt;
	}

	@Override
	public void save(Car carDt) {
		carRepository.save(carDt);
		
	}

	@Override
	public void deleteById(int theId) {
		carRepository.deleteById(theId);
	}

}
