package com.ams.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ams.entities.Reservation;

public interface ReservationRepository extends JpaRepository<Reservation, Long> {

}

