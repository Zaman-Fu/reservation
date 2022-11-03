package skyviewer.service.reservation;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import skyviewer.service.reservation.controllers.ReservationController;
import skyviewer.service.reservation.entities.Reservation;

@SpringBootTest
class ReservationApplicationTests {

	@Autowired
	ReservationController controller;
	
	@Test
	void contextLoads() {
		assertThat(controller).isNotNull();
	}
	
	@Test
	void CreateNewReservation_ValidInput_ReturnsCreated()
	{
		Reservation newRes=new Reservation(1000l,1l,"Dummy","Mockson","FF999999",
				"other",false,900f);
		List<Reservation> newResList=new ArrayList<Reservation>();
		newResList.add(newRes);
		ResponseEntity<List<Reservation>> response=controller.PostReservations(newResList);
		
		
		assertEquals(HttpStatus.CREATED, response.getStatusCode());
	}
	
	
	
	

}
