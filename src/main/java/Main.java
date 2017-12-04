import vol.MenuVol;

public class Main {
	
	public static void main(String[] args) {

		int choix = 0;;
		choix = Integer.parseInt(args[0]);
		
		System.out.println("1 - Gestion des vols");
		System.out.println("2 - Gestion des reservations");
		System.out.println("3 - Quittez\n");
		
		switch (choix) {
		case 1:
			MenuVol.main(args);
			break;
		case 2:
			break;
		case 3:
			break;
		default : 
			System.out.println("\nNumero incorrect");
			break;
		}
	}
}
