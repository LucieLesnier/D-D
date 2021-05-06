package donjon;

public class Wizard extends Personnages {

	Spell spell;

	public Wizard(String name, int life, int power, Spell spell) {
		super(name, life, power);
		this.spell = spell;
	}

	int potion;

	public Wizard(String name, int life, int power) {
		super(name, life, power);
	}

	public Wizard(String name) {
		super();
	}

	public Wizard() {
		super();
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

	public String toString() {
		String newLine = System.getProperty("line.separator");
		return "Votre nom : " + getName() + " le magicien" + newLine + "Votre vie : " + getLife() + newLine
				+ "Votre force d'attaque : " + getPower() + newLine + newLine + newLine;

	}

}
