package skyviewer.service.reservation.utils;

import java.time.LocalDate;
import java.time.LocalTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import skyviewer.service.reservation.entities.Reservation;
import skyviewer.service.reservation.repositories.ReservationRepository;



@Component
public class ReservationCommandLineRunner implements CommandLineRunner {

	
	@Autowired
	ReservationRepository reservationRepository;
	//We're doing this to have a table of users and accounts to play with in the app :)
	@Override
	public void run(String... args) throws Exception {

		reservationRepository.save(new Reservation(1l,1l,"Damian","Wayne","AT990592",
				"other",false,900f));

	}
}
