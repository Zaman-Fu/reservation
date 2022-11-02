package skyviewer.service.reservation.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import skyviewer.service.reservation.entities.Reservation;
import skyviewer.service.reservation.services.ReservationService;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class ReservationController {
	
	@Autowired
	ReservationService service;

	
	
	@PostMapping("reservation")
	public ResponseEntity<Reservation>PostReservation(@RequestBody Reservation newReservation){
		
		Reservation reservation=service.createReservation(newReservation);
		if(reservation==null)
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<>(reservation,HttpStatus.CREATED);
	}
	
	@PostMapping("reservations")
	public ResponseEntity<List<Reservation>> PostReservations(@RequestBody List<Reservation> newReservations)
	{
		List<Reservation> reservations=service.createReservations(newReservations);
		if(reservations==null)
		{
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		return new ResponseEntity<>(reservations,HttpStatus.CREATED);
	}
}
