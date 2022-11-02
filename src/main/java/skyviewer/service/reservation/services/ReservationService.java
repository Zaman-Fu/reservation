package skyviewer.service.reservation.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import skyviewer.service.reservation.entities.Reservation;
import skyviewer.service.reservation.repositories.ReservationRepository;

@Service
public class ReservationService {

	@Autowired
	ReservationRepository repository;

	public Reservation createReservation(Reservation newReservation) {
		//Make any pre-processing task
		return null;
	}

	public List<Reservation> createReservations(List<Reservation> newReservations) {
		// TODO Auto-generated method stub
		//Theoretically the input validation would take place here
		//If we have time we will implement
		return repository.saveAll(newReservations);
	}
}
