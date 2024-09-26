package com.arrowsmodule.movieBooking.dao;

import com.arrowsmodule.movieBooking.domain.entity.Seat;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SeatDao extends JpaRepository<Seat,Long> {
}