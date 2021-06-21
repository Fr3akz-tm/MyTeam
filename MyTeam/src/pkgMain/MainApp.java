package pkgMain;

import pkgData.Player;

public class MainApp {

	public static void main(String[] args) {
		Player player = new Player(2, "Dragovic", "Defense");
		System.out.println("== " + player);
		System.out.println("== " + player);
		player = new Player (8, "Baumgartner", "Midlefield");
		System.out.println("== " + player);
		player = new Player (7, "Baumgartlingerner", "Midlefield");
		System.out.println("== " + player);
	}

}
