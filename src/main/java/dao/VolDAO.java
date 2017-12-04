package dao;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import dao.DatabaseHelper;

import javax.persistence.EntityManager;

import dao.DatabaseHelper;
import vol.TypeAvion;
import vol.Vol;

public class VolDAO {

	public static void creerVol(String numeroVol, String typeAvion, Integer nombrePlace, String villeDepart,
			String villeArrivee, String LocalDate) {
		EntityManager vol = DatabaseHelper.createEntityManager();
		DatabaseHelper.beginTx(vol);

		Vol v = new Vol();
		v.setNombrePlace(nombrePlace);
		v.setNumeroVol(numeroVol);
		v.setTypeAvion(TypeAvion.valueOf(typeAvion));
		v.setVilleArrive(villeArrivee);
		v.setVilleDepart(villeDepart);
//		DateTimeFormatter dtf = DateTimeFormat.forPattern("dd-MM-yyyy");
//		LocalDate dt = dtf.parseLocalDate(LocalDate));
		vol.persist(v);
		DatabaseHelper.commitTxAndClose(vol);
		
	}
}