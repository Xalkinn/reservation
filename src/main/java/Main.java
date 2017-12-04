import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

import javax.persistence.EntityManager;

import vol.MenuVol;

public class Main {
	
	public static void premierMenu(String[] args) {
		
		System.out.println("============================ Menu Principal ============================\n");
		System.out.println("1 - Gestion des vols");
		System.out.println("2 - Gestion des reservations");
		System.out.println("3 - Quittez\n");
		
		Scanner scan = new Scanner(System.in);
		String choix = scan.nextLine();
				
		switch (choix) {
		case "1":
			
		case "2":
			break;
		case "3":
			break;
		default : 
			System.out.println("\nNumero incorrect");
			break;
		}
	}
}
