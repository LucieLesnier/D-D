package donjon;

public class Wizard{

	String name;
	int life;
	int power;
	Spell spell;
	public Wizard(String name, int life, int power, Spell spell) {
		super();
		this.name = name;
		this.life = life;
		this.power = power;
		this.spell = spell;
	}

	int potion;

	public Wizard(String name, int life, int power) {
		super();
		this.name = name;
		this.life = life;
		this.power = power;
	}
	public Wizard(String name) {
		super();
		this.name = name;
	}

	public Wizard() {
		super();
	}

	public String toString() {
		String newLine = System.getProperty("line.separator");
		return "Votre nom : " + name + " le magicien" + newLine + "Votre vie : " + life + newLine
				+ "Votre force d'attaque : " + power + newLine + newLine + newLine;

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

	public Spell getSpell() {
		return spell;
	}

	public void setSpell(Spell spell) {
		this.spell = spell;
	}

	public int getPotion() {
		return potion;
	}

	public void setPotion(int potion) {
		this.potion = potion;
	}

}
