package donjon;

public class Guerrier {

	String name;
	int life;
	int power;
	Weapon weapon;

	public Weapon getWeapon() {
		return weapon;
	}

	public void setWeapon(Weapon weapon) {
		this.weapon = weapon;
	}

	public Guerrier(String name, int life, int power, Weapon weapon) {
		super();
		this.name = name;
		this.life = life;
		this.power = power;
		this.weapon = weapon;
	}

	public Guerrier(String name, int life, int power) {
		this.name = name;
		this.life = life;
		this.power = power;

	}

	public Guerrier(String name) {
		super();
		this.name = name;
	}

	public Guerrier() {
		super();
	}

	public String toString() {
		String newLine = System.getProperty("line.separator");
		return "Ton nom : " + name + " le guerrier " + newLine + "Ta vie : " + life + newLine
				+ "Ta force d'attaque : " + power + newLine;

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

}
