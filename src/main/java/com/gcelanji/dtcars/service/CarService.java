package com.gcelanji.dtcars.service;

import java.util.List;

import com.gcelanji.dtcars.entity.Car;

public interface CarService {

	public List<Car> findAll();
	
	public Car findById(int theId);
	
	public void save(Car carDt);
	
	public void deleteById(int theId);
}
