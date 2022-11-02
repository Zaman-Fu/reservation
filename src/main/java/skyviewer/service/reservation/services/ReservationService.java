package skyviewer.service.reservation.services;

import org.springframework.stereotype.Service;

import skyviewer.service.reservation.entities.Reservation;
import skyviewer.service.reservation.repositories.ReservationRepository;

@Service
public class ReservationService {

	
	ReservationRepository repository;

	public Reservation createReservation(Reservation newReservation) {
		//Make any pre-processing task
		return null;
	}
}
