package donjon;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Menu {
	Scanner sc;
	List<Magicien> mageCreated;
	List<Guerrier> guerrierCreated;

	public Menu(Scanner sc) {
		super();
		this.sc = sc;
		this.mageCreated = new ArrayList<Magicien>();
		this.guerrierCreated = new ArrayList<Guerrier>();

	}

	static boolean exitDonjon = false;

	public void exit() {
		this.exitDonjon = true;
	}

	public void display() {
		do {
			displayMainMenu();
		} while (exitDonjon != true);
	}

	public void displayMainMenu() {
		/* Premier choix pour la création du personnage */
		System.out
				.println("''''''''''''''''''''''''''''''''''''''||\\\\''//||''''''''''''''''''''''''''''''''''''''''");
		System.out
				.println("''''''''''''''''''''''''''''''''''''''||'\\\\//'||''''''''''''''''''''''''''''''''''''''''");
		System.out.println("''''''''''''''''''''''''''''''''''''''||'MENU'||''''''''''''''''''''''''''''''''''''''''");
		System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
		System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
		// MENU DECO
		System.out.println("''''''''''''''''''''''''''''''''''''''''Bonjour!''''''''''''''''''''''''''''''''''''''''");
		System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
		System.out.println("Pour créer un guerrier tapez 1, pour un mage tapez 2, si vous souhaitez fuir, tapez 3");
		System.out.println("Vous pouvez également affiché vos joueurs en tapant 4!");
		int choice = sc.nextInt();
		/**/

		/* Condition selon le choix du joueur */

		if (choice == 1) {


			warriorCreated();
			System.out.println(
					"''''''''''''''''''''''''''''''''''''Bonne chance !''''''''''''''''''''''''''''''''''''''");
			System.out.println(
					"''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
			System.out.println(" ");
		}

		else if (choice == 2) {
			mageCreated();
		}

		else if (choice == 3) {
			exit();
			System.out.println("''''''''''''''''''''''''''''''''''Vous avez quitté le jeu'''''''''''''''''''''''");
		}

		else if (choice == 4) {
			System.out.println("Voici vos joueurs");
			System.out.println(this.mageCreated.toString());
			System.out.println(this.guerrierCreated.toString());

		}

		else {

			System.out.println("Choisis");
		}
	}

	public void warriorCreated() {

		System.out
				.println("''''''''''''''''''''''''''''''''Bienvenue à toi, jeune guerrier''''''''''''''''''''''''''''");

		System.out.println("Choisis maintenant le nom de ton personnage");
		String create = sc.next();
		String nameOfWarrior = create;
		/* Création du nom du personnage */
		System.out.println(" ");
		System.out.println(
				"''''''''''''''''''''''''Bienvenue à toi'''" + nameOfWarrior + "'''le guerrier'''''''''''''''''''''''");
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
		/**/
		System.out.println(" ");

		int pvAleatoire = 5 + (int) (Math.random() * ((10 - 5) + 1)); /* Répartissions aléatoires des points de vie */
		int powerAleatoire = 5
				+ (int) (Math.random() * ((10 - 5) + 1)); /* Répartissions aléatoire des points d'attaque */
		System.out.println("''''''''''" +nameOfWarrior + " ta vie sera de " + pvAleatoire
				+ " points et ta force d'attaque de " + powerAleatoire + " points ''''''''");

		/////////////////////// Création des armes

		// Pouvoir et résistance aléatoire pour chaque arme pour encore plus de fun
		int powerOf = 5 + (int) (Math.random() * ((20 - 5) + 1));
		int protection = 5 + (int) (Math.random() * ((20 - 5) + 1));
		int resistance = 5 + (int) (Math.random() * ((20 - 5) + 1));
		int shield = 0 + (int) (Math.random() * ((1 - 0) + 1));
		//////////////////////////////////////////////////////////////
		// Création d'une première arme
		String bigSword = "Une épée";
		Weapon sword = new Weapon(bigSword, powerOf, protection, resistance, shield);
		////////////////////////
		// Création d'une deuxième arme
		String bigArrow = "Un arc";
		Weapon arrow = new Weapon(bigArrow, powerOf, protection, resistance);
		//////////////////
		// Création d'une troisième arme
		String bigGun = "Un fusil à pompe";
		Weapon gun = new Weapon(bigGun, powerOf, protection, resistance);
		////////////////
		// Création d'une quatrième arme
		String bigCrossBow = "Une arbalète";
		Weapon crossBow = new Weapon(bigCrossBow, powerOf, protection, resistance, shield);
		//////////////////////////////
		// Création d'une cinquième arme
		String bigVege = "Un légume de saison";
		Weapon vegetable = new Weapon(bigVege, powerOf, protection, resistance, shield);
		/////////////////////////////
		Weapon weapon;
		int weaponRandom = 0 + (int) (Math.random() * ((5 - 0) + 1));
		if (weaponRandom == 0) {
			weapon = sword;

		} else if (weaponRandom == 1) {
			weapon = arrow;

		} else if (weaponRandom == 2) {
			weapon = crossBow;

		} else if (weaponRandom == 3) {
			weapon = gun;

		} else {
			weapon = vegetable;
		}
		System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
		System.out.println("Ton arme sera : " + weapon.name + " qui aura pour puissance : " + weapon.power
				+ " points, pour protection : " + weapon.protection + " points, pour resistance : " + weapon.resistance
				+ " points, et tu auras : " + weapon.shield + " bouclier");
		System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
		Guerrier guerrier = new Guerrier(nameOfWarrior, pvAleatoire, powerAleatoire,
				weapon); /* Création du nouveau personnage */
		this.guerrierCreated.add(guerrier);
	}

	public void mageCreated() {
		/* Création du nom du personnage */
		System.out.println("Bienvenue à toi, jeune mage");
		System.out.println("Choisis maintenant le nom de ton personnage");

		String create = sc.next();
		String nameOfMage = create;

		System.out.println("Bienvenue à toi " + nameOfMage + " le mage");
		/**/
		int pvAleatoire = 3 + (int) (Math.random() * ((6 - 3) + 1)); /* Répartissions aléatoires des points de vie */
		int powerAleatoire = 8
				+ (int) (Math.random() * ((15 - 8) + 1)); /* Répartissions aléatoire des points d'attaque */

		System.out.println(nameOfMage + " ta force de vie sera de " + pvAleatoire + " points et ta force d'attaque de "
				+ powerAleatoire + " points");

		// Création des armes aléatoires int powerOf = 5 + (int) (Math.random() * ((20 -
		// 5) + 1));
		int power = 5 + (int) (Math.random() * ((20 - 5) + 1));
		int scope = 5 + (int) (Math.random() * ((20 - 5) + 1));
		int potion = 0 + (int) (Math.random() * ((5 - 0) + 1));
		/////////////////////////////////////////////
		String harryPotter = "expeliarmus";
		Spell bigSpell = new Spell(harryPotter, power, scope, potion);
		////////////////////////////////////////////
		String cinderella = "Bibidiba bidibou";
		Spell notBigSpell = new Spell(cinderella, power, scope, potion);
		///////////////////////////////////////////
		String notForgiven = "Avaka kedavra";
		Spell bigBigSpell = new Spell(notForgiven, power, scope, potion);
		//////////////////////////////////////////
		String respectMyAutority = "Imperium";
		Spell sitDownAndShutUp = new Spell(respectMyAutority, power, scope, potion);
		/////////////////////////////////////////
		String brightTheLight = "Lumos";
		Spell hereIsTheLight = new Spell(brightTheLight, power, scope, potion);
		/////////////////////////////////////////
		String stopMoving = "Petrificus totalus";
		Spell youStayHere = new Spell(stopMoving, power, scope, potion);
		//////////////////////////////////////////
		String cleanThis = "Recurvite";
		Spell dirtyDirty = new Spell(cleanThis, power, scope, potion);
		/////////////////////////////////////////
		String goAway = "Portus";
		Spell byeByeBirdie = new Spell(goAway, power, scope, potion);
		///////////////////////////////////////////
		String forgetAll = "Oubliette";
		Spell whoAmI = new Spell(forgetAll, power, scope, potion);
		///////////////////////////////////////////

		Spell spell;
		int spellRandom = 1 + (int) (Math.random() * ((9 - 1) + 1));
		if (spellRandom == 1) {
			spell = bigSpell;
		} else if (spellRandom == 2) {
			spell = notBigSpell;
		} else if (spellRandom == 3) {
			spell = bigBigSpell;
		} else if (spellRandom == 4) {
			spell = sitDownAndShutUp;
		} else if (spellRandom == 5) {
			spell = hereIsTheLight;
		} else if (spellRandom == 6) {
			spell = youStayHere;
		} else if (spellRandom == 7) {
			spell = dirtyDirty;
		} else if (spellRandom == 8) {
			spell = byeByeBirdie;
		} else {
			spell = whoAmI;
		}
		Magicien mage = new Magicien(nameOfMage, pvAleatoire, powerAleatoire,
				spell); /* Création du nouveau personnage */
		this.mageCreated.add(mage);
		System.out.println(
				"Ton sort : " + spell.name + " , sa puissance sera de " + spell.power + " points , sa portée de : "
						+ spell.scope + " mètres " + "le nombre de potion que tu as : " + spell.potion);
		System.out.println("Bonne chance !");
		System.out.println("'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");

	}

}
