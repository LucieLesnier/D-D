package donjon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BoardGame {

	String value;
	Scanner sc= new Scanner(System.in);

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}

	public BoardGame() {

	}

	public void boardGame() {
		System.out.println(
				"Bienvenue dans la partie! le jeu est composée de 64 salles pleines de surprises, "
				+ " vous pouvez quitté la partie à tout moment en cliquant sur 2");
		List<String> boardCases = new ArrayList<String>();
		EmptyRoom room = new EmptyRoom();
		EnemyRoom enemy = new EnemyRoom();
		ObjectRoom loot = new ObjectRoom();
		// boardCases.add("H");
		for (int i = 0; i < 64; i++) {
			System.out.println("Pour avancer, cliquez sur 1");
			boardCases.add(String.valueOf(i));
			
			if (sc.nextInt() == 1) {
				int value = i + 1;
				System.out.println("Vous rentrez dans la salle " + boardCases.size());

				int random = (int) (Math.random() * ((3 - 1) + 1));

				if (random == 1) {
					
					room.setValue("|    La salle est vide          |");
					System.out.println("---------------------------------");
					System.out.println("|                               |");
					System.out.println(room.getValue());
					System.out.println("|                               |");
					System.out.println("---------------------------------");
				} else if (random == 2) {
					
					enemy.setName( "| La salle contient un ennemi " + "  |");
					System.out.println("---------------------------------");
					System.out.println("|                               |");
					System.out.println(enemy.getName());
					System.out.println("|                               |");
					System.out.println("---------------------------------");

				} else {

					loot.setValue("|  La salle contient un objet   |");
					System.out.println("---------------------------------");
					System.out.println("|                               |");
					System.out.println(loot.getValue());
					System.out.println("|                               |");
					System.out.println("---------------------------------");
				}
			} else {
				System.out.println("Vous avez quitté la partie");
				Menu menu = new Menu(sc);
				menu.display();
			}
		}
	}

}
