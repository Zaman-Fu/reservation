package skyviewer.service.reservation.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import skyviewer.service.reservation.entities.Reservation;



public interface ReservationRepository extends JpaRepository<Reservation,Long>{

}
