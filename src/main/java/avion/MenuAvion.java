package avion;

public class MenuAvion {
	public static void main(String[] args) {

		int choix_avion = 0;
		choix_avion = Integer.parseInt(args[0]);

		System.out.println("1 - Recherche avion par numero");
		System.out.println("2 - Recherche avion par ville de depard et arrive\n");

		switch (choix_avion) {
		case 1:
			break;
		case 2:
			break;
		default:
			System.out.println();
			System.out.println("Numero incorrect");
			break;
		}
	}

}
