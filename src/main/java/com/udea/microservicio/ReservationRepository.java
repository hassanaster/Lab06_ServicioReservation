package com.udea.microservicio;


import java.util.Collection;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.udea.microservicio.Reservation;



@RepositoryRestResource
public interface ReservationRepository extends JpaRepository<Reservation, Long>{
	@RestResource(path = "by-name")
    Collection<Reservation> findByReservationName(@Param("rn") String rn);

	//Object save(Reservation reservation);

	//Stream<Reservation> findAll();
}
