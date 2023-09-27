package ita3.car.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ita3.car.entity.Car;

@Repository
public interface ICarRepository extends JpaRepository<Car, Long> {
    
}
