package com.ams.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.bharath.flightreservation.entities.Passenger;

public interface PassengerRepository extends JpaRepository<Passenger, Long> {

}
