package donjon;

public class Warrior extends Personnages {

	Weapon weapon;

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Warrior(String name, int life, int power, Weapon weapon) {
		super(name, life, power);

		this.weapon = weapon;
	}

	public Warrior(String name, int life, int power) {
		super(name, life, power);

	}

	public Warrior(String name) {
		super();

	}

	public Warrior() {
		super();
	}

	public String toString() {
		String newLine = System.getProperty("line.separator");
		return "Ton nom : " + getName() + " le guerrier " + newLine + "Ta vie : " + getLife() + newLine
				+ "Ta force d'attaque : " + getPower() + newLine;

	}

}
