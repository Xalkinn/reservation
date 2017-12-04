import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

import javax.persistence.EntityManager;

import dao.VolDAO;

public class Main {

	public static void main(String[] args) {

		System.out.println("============================ Menu Principal ============================\n");
		System.out.println("1 - Gestion des vols");
		System.out.println("2 - Gestion des reservations");
		System.out.println("3 - Quittez\n");

		System.out.println("Entrez votre choix : ");
		Scanner scan = new Scanner(System.in);
		String choix = scan.nextLine();

		switch (choix) {
		case "1":
			menuVol(args);
			break;
		case "2":
			break;
		case "3":
			break;
		default:
			System.out.println("\nNumero incorrect\n");
			main(args);
			break;
		}
	}

	public static void menuVol(String[] args) {

		System.out.println("============================ Menu des vols ============================\n");
		System.out.println("1 - Creation de vol");
		System.out.println("2 - Liste vol");
		System.out.println("3 - Recherche avion");
		System.out.println("4 - Retour\n");

		System.out.println("Entrez votre choix : ");
		Scanner scan = new Scanner(System.in);
		String choix_2 = scan.nextLine();

		switch (choix_2) {
		case "1":
			System.out.println("Entrez le numero de vol : ");
			Scanner scan_vol = new Scanner(System.in);
			String choixNumeroVol = scan.nextLine();
			
			System.out.println("Entrez le type d'avion (A330, A340, A380, B747) : ");
			Scanner scan_type = new Scanner(System.in);
			String choixTypeAvion = scan.nextLine();
			
			System.out.println("Entrez le nombre de place : ");
			Scanner scan_place = new Scanner(System.in);
			String choixNombrePlace = scan.nextLine();
			
			System.out.println("Entrez la ville de depart : ");
			Scanner scan_villeD = new Scanner(System.in);
			String choixVilleDepart = scan.nextLine();
			
			System.out.println("Entrez la ville d'arrivee : ");
			Scanner scan_villeA = new Scanner(System.in);
			String choixVilleArrivee = scan.nextLine();
			
			System.out.println("Entrez la date au format jj-mm-aaaa : ");
			Scanner scan_date = new Scanner(System.in);
			String choixDate = scan.nextLine();
			
			main(args);
		case "2":
			break;
		case "3":

		case "4":
			main(args);
		default:
			System.out.println("\nNumero incorrect - Retour au programme principal\n");
			main(args);
			break;
		}
	}
}
