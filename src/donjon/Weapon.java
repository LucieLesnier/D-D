package donjon;

public class Weapon{
	String name;
	int resistance;
	int protection;
	int power;
	int shield;

	@Override
	public String toString() {
		String newLine = System.getProperty("line.separator");
		return "Ton arme : " + name + newLine + "sa résistance : " + resistance  +  " points ," + newLine + "sa protection : " + protection + " points , " + newLine + "son pouvoir : " + power
				 + newLine +  "et il possede " + shield + " bouclier"+ newLine ;
	}

	public Weapon(String name, int resistance, int protection, int power, int shield) {
		super();
		this.name = name;
		this.resistance = resistance;
		this.protection = protection;
		this.power = power;
		this.shield = shield;
	}

	public Weapon(String name, int resistance, int protection, int power) {
		super();
		this.name = name;
		this.resistance = resistance;
		this.protection = protection;
		this.power = power;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getResistance() {
		return resistance;
	}

	public void setResistance(int resistance) {
		this.resistance = resistance;
	}

	public int getProtection() {
		return protection;
	}

	public void setProtection(int protection) {
		this.protection = protection;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int isShield() {
		return shield;
	}

	public void setShield(int shield) {
		this.shield = shield;
	}

}
