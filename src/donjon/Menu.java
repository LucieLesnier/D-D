/**@author lesnierl **/

/**@param
 *
 */
package donjon;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Menu {
	Scanner sc;
	List<Personnages> Perso;

	public Menu(Scanner sc) {
		super();
		this.sc = sc;
		this.Perso = new ArrayList<Personnages>();
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
		// MENU DECO
		System.out.println("''''''''''''''''''''''''''''''''''''''''Bonjour!''''''''''''''''''''''''''''''''''''''''");
		System.out.println("Pour créer un guerrier tapez 1, pour un mage tapez 2, si vous souhaitez fuir, tapez 3");
		System.out.println("Vous pouvez également affiché vos joueurs en tapant 4, modifier vos joueurs en tapant 5");
		int choice = askInt();
		/**/
		/* Condition selon le choix du joueur */
		if (choice == 1) {

			warriorCreated();
			System.out.println(
					"''''''''''''''''''''''''''''''''''''Bonne chance !''''''''''''''''''''''''''''''''''''''");
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

			System.out.println(this.Perso.toString());

		} else if (choice == 5) {
			System.out.println(this.Perso.toString());
			changeHeroes();
		}
		else {
			System.out.println("Choisis");
		}
	}
	private int askInt() {
		while (true) {
			try {
				int catchInt = sc.nextInt();
				sc.nextLine();
				return catchInt;
			} catch (InputMismatchException e) {
				System.out.println("Veuillez entré un numéro");
				sc.nextLine();
			}
		}
	}

	public void warriorCreated() {

		System.out
				.println("''''''''''''''''''''''''''''''''Bienvenue à toi, jeune guerrier''''''''''''''''''''''''''''");

		System.out.println("Choisis maintenant le nom de ton personnage");
		String create = sc.next();
		String nameOfWarrior = create;
		/* Création du nom du personnage */
		System.out.println(
				"''''''''''''''''''''''''Bienvenue à toi'''" + nameOfWarrior + "'''le guerrier'''''''''''''''''''''''");
		/**/
		System.out.println(" ");

		int pvRandom = 5 + (int) (Math.random() * ((10 - 5) + 1)); /* Répartissions aléatoires des points de vie */
		int powerRandom = 5 + (int) (Math.random() * ((10 - 5) + 1)); /* Répartissions aléatoire des points d'attaque */
		System.out.println("''''''''''" + nameOfWarrior + " ta vie sera de " + pvRandom
				+ " points et ta force d'attaque de " + powerRandom + " points ''''''''");

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
		System.out.println("Ton arme sera : " + weapon.name + " qui aura pour puissance : " + weapon.power
				+ " points, pour protection : " + weapon.protection + " points, pour resistance : " + weapon.resistance
				+ " points, et tu auras : " + weapon.shield + " bouclier");
		System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
		Warrior warrior = new Warrior(nameOfWarrior, pvRandom, powerRandom,
				weapon); /* Création du nouveau personnage */
		this.Perso.add(warrior);
	}

	public void mageCreated() {

		/* Création du nom du personnage */
		System.out.println("Bienvenue à toi, jeune mage");
		System.out.println("Choisis maintenant le nom de ton personnage");

		String create = sc.next();
		String nameOfMage = create;

		System.out.println("Bienvenue à toi " + nameOfMage + " le mage");
		/**/
		int pvRandom = 3 + (int) (Math.random() * ((6 - 3) + 1)); /* Répartissions aléatoires des points de vie */
		int powerRandom = 8 + (int) (Math.random() * ((15 - 8) + 1)); /* Répartissions aléatoire des points d'attaque */

		System.out.println(nameOfMage + " ta force de vie sera de " + pvRandom + " points et ta force d'attaque de "
				+ powerRandom + " points");

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
		Wizard mage = new Wizard(nameOfMage, pvRandom, powerRandom, spell); /* Création du nouveau personnage */
		this.Perso.add(mage);
		System.out.println(
				"Ton sort : " + spell.name + " , sa puissance sera de " + spell.power + " points , sa portée de : "
						+ spell.scope + " mètres " + "le nombre de potion que tu as : " + spell.potion);
		System.out.println("Bonne chance !");
		System.out.println(
				"'''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''''");
		/////// Modifications des personnages
		// Je veux pouvoir modifier les infos de mon personnage lorsque j'appuie sur
		/////// éditer
		// this.mageCreated.indexOf(mageCreated);

		// System.out.println(mage);

	}

	public void displayAll() {
		int index = 0;
		for (Personnages p : Perso) {
			
			System.out.println(index + " - " + p.getName());
			
			index++;
		}
		System.out.println("Si vous souhaitez supprimé un personnage, séléctionné l'index et tapez 'delete' ");
	}

	public void changeHeroes() {
		this.displayAll();

		int choice = sc.nextInt();
		System.out.println("Vous avez séléctionné l'élement " + choice + " tapez le nom que vous souhaitez définir");
		Personnages a = Perso.get(choice);
		int index = 0;
	
		 
		a.setName(sc.nextLine());
		if(a instanceof Wizard ) {
		System.out.println("Votre personnage devient donc " + a.getName() + " le magicien");
		}else {
			System.out.println("Votre personnage devient donc " + a.getName() + " le guerrier");
		}
		
	}
	public void deleteHero() {
		this.displayAll();
		
		Iterator remove = Perso.iterator();
		int choice = sc.nextInt();
	if(choice == 000) {
			
		
		String choiceRemove = sc.nextLine();
		System.out.println("Vous avez séléctionné l'élement " + choice + " tapez delete");
		if(choiceRemove == "delete") {
			remove.remove();
		} else {
			changeHeroes();
		}
	}
	}

}
