package personnages;

public abstract class Personnages {
	private String name;
	private int life;
	private int power;

	public Personnages() {
		super();
	}

	public Personnages(String name, int life, int power) {
		super();
		this.name = name;
		this.life = life;
		this.power = power;
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
