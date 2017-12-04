package reservation;

import java.time.LocalDate;
import java.time.format.DateTimeFormatterBuilder;

import javax.persistence.EntityManager;

import dao.DatabaseHelper;
import dao.VolDAO;
import vol.TypeAvion;
import vol.Vol;

public class MainTest {
	
	public static void main(String[] args) {
		EntityManager connexion = DatabaseHelper.createEntityManager();
		DatabaseHelper.beginTx(connexion);
		
		Vol vol1 = new Vol("0001", TypeAvion.A330, 5, "Paris", "Montpellier", LocalDate.now());
		
		connexion.persist(vol1);
		DatabaseHelper.commitTxAndClose(connexion);
	}
	
}
