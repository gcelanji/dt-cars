package com.gcelanji.dtcars.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gcelanji.dtcars.entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

}
