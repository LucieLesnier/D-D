package equipment;

public class Spell {
	String name;
	int power;
	int scope;
	public Spell(String name, int power, int scope, int potion) {
		super();
		this.name = name;
		this.power = power;
		this.scope = scope;
		this.setPotion(potion);
	}
	@Override
	public String toString() {
		String newLine = System.getProperty("line.separator");
		return "Le sort : " + name + newLine + "Sa puissance" + power + newLine + "Sa portée :" + scope + "mètres" + newLine + "Le nombre de potion :" + getPotion();
	}
	private int potion;
	public Spell(String name, int power, int scope) {
		super();
		this.name = name;
		this.power = power;
		this.scope = scope;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPower() {
		return power;
	}
	public void setPower(int power) {
		this.power = power;
	}
	public int getScope() {
		return scope;
	}
	public void setScope(int scope) {
		this.scope = scope;
	}
	public int getPotion() {
		return potion;
	}
	public void setPotion(int potion) {
		this.potion = potion;
	}	

}
