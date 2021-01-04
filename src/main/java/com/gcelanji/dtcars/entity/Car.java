package com.gcelanji.dtcars.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="cars")
public class Car {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	
	@Column(name="make")
	private String make;
	
	@Column(name="model")
	private String model;
	
	@Column(name="release_year")
	private int releaseYear;
	
	@Column(name="mileage")
	private int mileage;
	
	@Column(name="transmission")
	private String transmission;
	
	@Column(name="engine_L")
	private float engine_L;
	
	@Column(name="category")
	private String category;
	
	@Column(name="fuel")
	private String fuel;
	
	@Column(name="doors")
	private int doors;
	
	@Column(name="seats")
	private int seats;
	
	public Car() {
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getReleaseYear() {
		return releaseYear;
	}

	public void setReleaseYear(int releaseYear) {
		this.releaseYear = releaseYear;
	}

	public int getMileage() {
		return mileage;
	}

	public void setMileage(int mileage) {
		this.mileage = mileage;
	}

	public String getTransmission() {
		return transmission;
	}

	public void setTransmission(String transmission) {
		this.transmission = transmission;
	}

	public float getEngine_L() {
		return engine_L;
	}

	public void setEngine_L(float engine_L) {
		this.engine_L = engine_L;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getFuel() {
		return fuel;
	}

	public void setFuel(String fuel) {
		this.fuel = fuel;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getSeats() {
		return seats;
	}

	public void setSeats(int seats) {
		this.seats = seats;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", make=" + make + ", model=" + model + ", releaseYear=" + releaseYear + ", mileage="
				+ mileage + ", transmission=" + transmission + ", engine_L=" + engine_L + ", category=" + category
				+ ", fuel=" + fuel + ", doors=" + doors + ", seats=" + seats + "]";
	}
	
}
