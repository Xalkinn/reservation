package vol;

import avion.MenuAvion;

public class MenuVol {
	public static void main(String[] args) {
		
		int choix_vol = 0;;
		choix_vol = Integer.parseInt(args[0]);
		
		System.out.println("1 - Creation de vol");
		System.out.println("2 - Liste vol");
		System.out.println("3 - Recherche avion\n");
		
		switch (choix_vol) {
		case 1:
			break;
		case 2:
			break;
		case 3:
			MenuAvion.main(args);
			break;
		default : 
			System.out.println();
			System.out.println("Numero incorrect");
			break;
		}
	}
}
